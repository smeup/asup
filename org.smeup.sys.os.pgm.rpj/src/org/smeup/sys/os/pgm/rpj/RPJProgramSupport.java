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
package org.smeup.sys.os.pgm.rpj;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import javax.inject.Inject;

import org.smeup.sys.il.core.QThread;
import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.il.data.DataSpecial;
import org.smeup.sys.il.data.DatetimeFormat;
import org.smeup.sys.il.data.IntegratedLanguageDataRuntimeException;
import org.smeup.sys.il.data.QArray;
import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QBufferedElement;
import org.smeup.sys.il.data.QBufferedList;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QData;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataFiller;
import org.smeup.sys.il.data.QDataStruct;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QDatetime;
import org.smeup.sys.il.data.QDecimal;
import org.smeup.sys.il.data.QIndicator;
import org.smeup.sys.il.data.QIntegratedLanguageDataFactory;
import org.smeup.sys.il.data.QList;
import org.smeup.sys.il.data.QNumeric;
import org.smeup.sys.il.data.QPointer;
import org.smeup.sys.il.data.QString;
import org.smeup.sys.il.data.QStroller;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Module;
import org.smeup.sys.il.data.annotation.Module.Scope;
import org.smeup.sys.il.data.annotation.Overlay;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.def.DecimalType;
import org.smeup.sys.il.esam.QDataSet;
import org.smeup.sys.il.esam.QDisplay;
import org.smeup.sys.il.esam.QPrint;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.os.core.OperatingSystemMessageException;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.pgm.QProgram;
import org.smeup.sys.os.pgm.QProgramManager;
import org.smeup.sys.os.pgm.base.BaseCallableInjector;
import org.smeup.sys.os.pgm.base.BaseProgramStatusImpl;

@Module(name = "*RPJ", scope = Scope.OWNER)
public class RPJProgramSupport {

	@Inject
	private BaseCallableInjector injector;
	@Inject
	private QDataContext dataContext;
	@Inject
	private QProgramManager programManager;
	@Inject
	private QResourceManager resourceManager;

	@Inject
	public QJob job;

	@Inject
	@Program(name = "*OWNER")
	private Object programOwner;

	@Overlay(name = "*PGMSTATUS")
	private BaseProgramStatusImpl programStatus;

	@DataDef
	public QIndicator qINOF;
	@DataDef
	public QIndicator qINRT;
	@DataDef
	public QIndicator qINLR;
	@DataDef
	public QIndicator qINKA;
	@DataDef
	public QIndicator qINKB;
	@DataDef
	public QIndicator qINKC;
	@DataDef
	public QIndicator qINKD;
	@DataDef
	public QIndicator qINKE;
	@DataDef
	public QIndicator qINKF;
	@DataDef
	public QIndicator qINKG;
	@DataDef
	public QIndicator qINKH;
	@DataDef
	public QIndicator qINKI;
	@DataDef
	public QIndicator qINKJ;
	@DataDef
	public QIndicator qINKK;
	@DataDef
	public QIndicator qINKL;
	@DataDef
	public QIndicator qINKM;
	@DataDef
	public QIndicator qINKN;
	@DataDef
	public QIndicator qINKP;
	@DataDef
	public QIndicator qINKQ;
	@DataDef
	public QIndicator qINKR;
	@DataDef
	public QIndicator qINKS;
	@DataDef
	public QIndicator qINKT;
	@DataDef
	public QIndicator qINKU;
	@DataDef
	public QIndicator qINKV;
	@DataDef
	public QIndicator qINKW;
	@DataDef
	public QIndicator qINKX;
	@DataDef
	public QIndicator qINKY;
	@DataDef
	public QIndicator qINU1;
	@DataDef
	public QIndicator qINU2;
	@DataDef
	public QIndicator qINU3;
	@DataDef
	public QIndicator qINU4;
	@DataDef
	public QIndicator qINU5;
	@DataDef
	public QIndicator qINU6;
	@DataDef
	public QIndicator qINU7;
	@DataDef
	public QIndicator qINU8;
	@DataDef
	public QIndicator qINU9;

	@DataDef
	public Date qDATE;

	public static Specials qSP;

	@DataDef(length = 1024)
	public QCharacter qLDA;

	@DataDef(dimension = 99, length = 1)
	public QArray<QIndicator> qIN;

	private QDataFiller dataFiller = QIntegratedLanguageDataFactory.eINSTANCE.createDataFiller();

	public Object getProgramOwner() {
		return this.programOwner;
	}

	public static class Date extends QDataStructWrapper {

		private static final long serialVersionUID = 1L;

		@DataDef(precision = 4)
		public QDecimal uyear4;

		@DataDef(precision = 2)
		public QDecimal uyear;
	}

	// public static boolean FALSE = false;
	public static boolean TRUE = true;

	private int countRunnable = 0;

	public boolean qRunnable() {
		if (countRunnable == 10) {
			countRunnable = 0;
			QThread thread = job.getJobThread();
			if (thread != null)
				return thread.checkRunnable();
			else
				return !Thread.currentThread().isInterrupted();
		} else {
			countRunnable++;
			return true;
		}
	}

	public static class Specials {

		public static DataSpecial NULL = DataSpecial.NULL;
		public static DataSpecial OMIT = DataSpecial.OMIT;

		public static DataSpecial OFF = DataSpecial.OFF;
		public static DataSpecial ON = DataSpecial.ON;
		public static DataSpecial ZERO = DataSpecial.ZERO;
		public static DataSpecial ZEROS = DataSpecial.ZEROS;
		public static DataSpecial BLANK = DataSpecial.BLANK;
		public static DataSpecial BLANKS = DataSpecial.BLANKS;
		public static DataSpecial LOVAL = DataSpecial.LOVAL;
		public static DataSpecial HIVAL = DataSpecial.HIVAL;

		public static DatetimeFormat ISO = DatetimeFormat.ISO;
		public static DatetimeFormat MS = DatetimeFormat.MILLISECONDS;
		public static DatetimeFormat Y = DatetimeFormat.YEAR;
		public static DatetimeFormat YEARS = DatetimeFormat.YEARS;
		public static DatetimeFormat M = DatetimeFormat.MONTH;
		public static DatetimeFormat MONTHS = DatetimeFormat.MONTHS;
		public static DatetimeFormat D = DatetimeFormat.DAY;
		public static DatetimeFormat DAYS = DatetimeFormat.DAYS;
	}

	private static enum LookupOperator {
		EQ, LT, LE, GT, GE;
	}

	/*
	 * public QBufferedData qBox(Enum<?> label) { return null; }
	 */

	public QNumeric qBitand(int expression, byte expression2) {
		// TODO Auto-generated method stub
		return null;
	}

	public QDecimal qBitand(Integer expression, QDecimal expression2) {
		return null;
	}

	public QDecimal qBitnot(Integer expression) {
		return null;
	}

	public QDecimal qBitxor(Integer expression, QDecimal expression2) {
		return null;
	}

	public QIndicator qBox(boolean boolean_) {

		QIndicator qIndicator = dataContext.getDataFactory().createIndicator(true);
		qIndicator.eval(boolean_);

		return qIndicator;
	}

	public QDecimal qBox(Integer decimal) {

		QDecimal qDecimal = null;

		if (decimal == null)
			qDecimal = dataContext.getDataFactory().createDecimal(0, 0, DecimalType.ZONED, false);
		else if (Math.abs(decimal) >= 0 && Math.abs(decimal) <= 9)
			qDecimal = dataContext.getDataFactory().createDecimal(1, 0, DecimalType.ZONED, true);
		else if (Math.abs(decimal) >= 10 && Math.abs(decimal) <= 99)
			qDecimal = dataContext.getDataFactory().createDecimal(2, 0, DecimalType.ZONED, true);
		else if (Math.abs(decimal) >= 100 && Math.abs(decimal) <= 999)
			qDecimal = dataContext.getDataFactory().createDecimal(3, 0, DecimalType.ZONED, true);
		else if (Math.abs(decimal) >= 1000 && Math.abs(decimal) <= 9999)
			qDecimal = dataContext.getDataFactory().createDecimal(4, 0, DecimalType.ZONED, true);
		else if (Math.abs(decimal) >= 10000 && Math.abs(decimal) <= 99999)
			qDecimal = dataContext.getDataFactory().createDecimal(5, 0, DecimalType.ZONED, true);
		else if (Math.abs(decimal) >= 100000 && Math.abs(decimal) <= 999999)
			qDecimal = dataContext.getDataFactory().createDecimal(6, 0, DecimalType.ZONED, true);
		else if (Math.abs(decimal) >= 1000000 && Math.abs(decimal) <= 9999999)
			qDecimal = dataContext.getDataFactory().createDecimal(7, 0, DecimalType.ZONED, true);
		else if (Math.abs(decimal) >= 10000000 && Math.abs(decimal) <= 99999999)
			qDecimal = dataContext.getDataFactory().createDecimal(8, 0, DecimalType.ZONED, true);
		else if (Math.abs(decimal) >= 100000000 && Math.abs(decimal) <= 999999999)
			qDecimal = dataContext.getDataFactory().createDecimal(9, 0, DecimalType.ZONED, true);
		else
			qDecimal = dataContext.getDataFactory().createDecimal(10, 0, DecimalType.ZONED, true);

		qDecimal.eval(decimal);

		return qDecimal;
	}

	public QDecimal qBox(Double double_) {

		QDecimal qDecimal = null;

		if (double_ == null)
			qDecimal = dataContext.getDataFactory().createDecimal(0, 0, DecimalType.ZONED, false);
		else if (Math.abs(double_) >= 0 && Math.abs(double_) <= 9)
			qDecimal = dataContext.getDataFactory().createDecimal(1, 0, DecimalType.ZONED, true);
		else
			qDecimal = dataContext.getDataFactory().createDecimal(10, 0, DecimalType.ZONED, true);

		qDecimal.eval(double_);

		return qDecimal;
	}

	public QCharacter qBox(String character) {

		QCharacter qCharacter = null;
		if (character == null)
			qCharacter = dataContext.getDataFactory().createCharacter(0, false, false);
		else
			qCharacter = dataContext.getDataFactory().createCharacter(character.length(), false, true);

		qCharacter.eval(character);

		return qCharacter;
	}

	public QCharacter qBox(byte character) {

		QCharacter qCharacter = dataContext.getDataFactory().createCharacter(1, false, true);
		qCharacter.eval(character);

		return qCharacter;
	}

	public QIndicator qCast(QCharacter xin) {
		QIndicator indicator = dataContext.getDataFactory().createIndicator(false);
		xin.assign(indicator);
		return indicator;
	}

	public void qCall(QString program, QData[] parameters) {
		qCall(program.trimR(), parameters);
	}

	public void qCall(String program, QData[] parameters) {
		qCall(program, parameters, (QIndicator) null);
	}

	public void qCall(QString program, QData[] parameters, QIndicator error) {
		qCall(program.trimR(), parameters, error);
	}

	public void qCall(String program, QData[] parameters, QIndicator error) {

		try {
			if (error != null)
				error.eval(false);
			programManager.callProgram(job, getProgram(program.trim()), parameters);
		} catch (Exception e) {
			if (error != null)
				error.eval(true);
			else
				throw new OperatingSystemMessageException("00211", e.getMessage(), 40);
		}
	}

	public void qCall(QString program, QData[] parameters, String errorHandling) {
		qCall(program.trimR(), parameters, errorHandling);
	}

	public void qCall(String program, QData[] parameters, String errorHandling) {
		try {
			qError().eval(false);
			programManager.callProgram(job, getProgram(program.trim()), parameters);
		} catch (Exception e) {
			// TODO
			qError().eval(true);
		}
	}

	@SuppressWarnings("resource")
	private QProgram getProgram(String name) {

		QProgram program = null;

		QContext jobContext = job.getContext();
		RPJProgramCache programCache = jobContext.get(RPJProgramCache.class);
		if (programCache == null) {
			synchronized (job) {
				programCache = jobContext.get(RPJProgramCache.class);
				if (programCache == null) {
					programCache = new RPJProgramCache();
					jobContext.set(RPJProgramCache.class, programCache);
				}
			}
		}

		program = programCache.get(name);
		if (program == null) {
			QResourceReader<QProgram> programReader = resourceManager.getResourceReader(job, QProgram.class, org.smeup.sys.il.memo.Scope.LIBRARY_LIST);
			program = programReader.lookup(name);
			if (program == null)
				throw new OperatingSystemRuntimeException("Program not found: " + name);
			programCache.put(name, program);
		}

		return program;
	}

	public QBufferedData qChar(QBinary numeric) {
		return qBox(Long.toString(numeric.asLong()));
	}

	public QString qChar(QDecimal numeric) {
		if (numeric.getScale() > 0)
			return qBox(Double.toString(numeric.asDouble()));
		else
			return qBox(Long.toString(numeric.asLong()));
	}

	public QString qChar(int number) {

		QCharacter character = dataContext.getDataFactory().createCharacter(19, true, true);
		character.eval(Integer.toString(number));

		return character;
	}

	public QDecimal qCheck(String comparator, QString base, Integer start) {
		// returns the first position of the string base that contains a
		// character that does not appear in string comparator
		if (start == null)
			start = 1;
		QDecimal decimal = dataContext.getDataFactory().createDecimal(5, 0, DecimalType.PACKED, true);

		int i = 0;
		int s = 0;
		while (true) {
			i = base.qSubst(start).trimR().indexOf(comparator, s);
			if (i != -1)
				s++;
			break;
		}

		if (s > 0)
			decimal.eval(s + 1);
		else
			decimal.eval(base.qSubst(start).trimR().length());

		return decimal;
	}

	public QDecimal qCheckr(String comparator, QString base, Integer start) {
		// TODO verify
		if (start == null)
			start = 1;
		QDecimal decimal = dataContext.getDataFactory().createDecimal(5, 0, DecimalType.PACKED, true);
		int i = 0;
		int s = base.qSubst(start).trimR().length();
		String string = base.qSubst(start).trimR();
		while (true) {
			i = string.indexOf(comparator, s);
			if (i != -1)
				s--;
			break;
		}

		if (s > 0)
			decimal.eval(s - 1);
		else
			decimal.eval(string.length());

		return decimal;
	}

	public QDecimal qDec(QNumeric numeric, int precision, int scale) {
		return null;
	}

	public QDecimal qDec(QString string, int precision, int scale) {
		return null;
	}

	public QDecimal qDec(String string, int precision, int scale) {
		return null;
	}

	public QDatetime qAdddur(QDatetime op1, QDecimal op2, Enum<?> format) {
		return null;
	}

	public QDatetime qSubdur(QDatetime op1, QDecimal op2, Enum<?> format) {
		return null;
	}

	public QDecimal qDiff(QDatetime op1, QDatetime op2, Enum<?> format) {
		return null;
	}

	public void qDisplay(QString text) {
		System.out.println(text);
	}

	public QString qEditc(QNumeric numeric, String format) {
		// TODO
		QCharacter character = dataContext.getDataFactory().createCharacter(numeric.getLength(), false, true);

		switch (format) {
		case "Z":
			// character.eval(numberFormat.format(numeric.asInteger()));
			// TODO
			// remove leading zero
			character.eval(Integer.toString(numeric.asInteger()).replaceAll("^0+", ""));
			break;
		case "X":
			character.move(numeric);
			break;
		default:
			System.out.println("Unexpected condition: sbdofsd8frRWE6R");
			break;
		}

		return character;
	}

	public QString qEditc(int numeric, String format) {
		return qEditc(qBox(numeric), format);
	}

	public QString qEditw(QNumeric numeric, String format) {
		// TODO
		QCharacter character = null;
		if (numeric.getLength() == 1) {
			character = dataContext.getDataFactory().createCharacter(numeric.getLength(), false, true);
			character.eval(Integer.toString(numeric.asInteger()));
		} else {
			character = dataContext.getDataFactory().createCharacter(numeric.getLength(), true, true);
			character.eval(Double.toString(numeric.asDouble()).replaceAll("\\.", ""));
		}

		return character;
	}

	public QIndicator qEof(QDataSet<?> dataSet) {
		if (dataSet == null)
			return qEof();
		else
			return qBox(dataSet.isEndOfData());
	}

	public QIndicator qEof() {
		return this.dataContext.endOfData();
	}

	public QIndicator qOpen(QDataSet<?> dataSet) {
		return qBox(dataSet.isOpen());
	}

	public QIndicator qOpen(QDisplay<?> display) {
		return qBox(display.isOpen());
	}

	public QIndicator qOpen(QPrint<?> print) {
		return qBox(print.isOpen());
	}

	public QIndicator qEqual(QDataSet<?> dataSet) {
		return qBox(dataSet.onError());
	}

	public QIndicator qError() {
		return qBox(false);
	}

	public QIndicator qError(QDataSet<?> dataSet) {
		if (dataSet == null)
			return qBox(true);
		else
			return qBox(dataSet.onError());
	}

	public QIndicator qFound() {
		return this.dataContext.found();
	}

	public QIndicator qFound(QDataSet<?> dataSet) {
		if (dataSet == null)
			return qFound();
		else
			return qBox(dataSet.isFound());
	}

	public QDecimal qInt(QString string) {
		return qBox(Integer.parseInt(string.trimR()));
	}

	public QDecimal qInt(Integer numeric) {
		return qBox(numeric);
	}

	public void qJump(Enum<?> label) {
	}

	public void qLabel(Enum<?> name) {
	}

	public QPointer qAddr(QBufferedData bufferedData) {
		return bufferedData.qAddr();
	}

	public QPointer qPaddr(QString string) {
		return null;
	}

	public QPointer qAlloc(QNumeric size) {
		return qAlloc(size.asInteger());
	}

	public QPointer qAlloc(Integer size) {
		return dataContext.getDataFactory().createPointer(size);
	}

	public QPointer qRealloc(QPointer pointer, QNumeric size) {
		return qRealloc(pointer, size.asInteger());
	}

	public QPointer qRealloc(QPointer pointer, Integer size) {
		return dataContext.getDataFactory().createPointer(pointer, size);
	}

	public void qDealloc(QPointer pointer) {
		// TODO
	}

	public QDecimal qSize(QBufferedData bufferedData) {
		QDecimal decimal = dataContext.getDataFactory().createDecimal(7, 0, DecimalType.ZONED, true);
		decimal.eval(bufferedData.getSize());
		return decimal;
	}

	public QDecimal qSize(QBufferedList<?> bufferedData) {
		QDecimal decimal = dataContext.getDataFactory().createDecimal(7, 0, DecimalType.ZONED, true);
		decimal.eval(bufferedData.getSize() / bufferedData.capacity());
		return decimal;
	}

	public QDecimal qRem(QNumeric ope1, QNumeric ope2) {
		return null;
	}

	public QDecimal qStatus() {
		return programStatus.getStatusCode();
	}

	public QString qReplace(String replacement, String source, Integer from, Integer length) {

		StringBuffer sb = new StringBuffer();
		sb.append(source.substring(0, from - 1));
		sb.append(replacement);
		sb.append(source.substring(from + length - 1));

		QCharacter character = dataContext.getDataFactory().createCharacter(sb.length(), false, true);
		character.eval(sb.toString());

		return character;
	}

	public QArray<?> qSubarr(QArray<?> array, int start, int elements) {

		return array.qSubarr(start, elements);
	}

	public QString qTrim(String source) {
		return qTrim(qBox(source));
	}

	public QString qTrim(QString source) {

		String str = source.trim();
		QCharacter character = dataContext.getDataFactory().createCharacter(str.length(), false, true);
		character.eval(str);

		return character;

	}

	public QString qTriml(String source) {
		return qTriml(qBox(source));
	}

	public QString qTriml(QString source) {

		String str = source.trimL();
		QCharacter character = dataContext.getDataFactory().createCharacter(str.length(), false, true);
		character.eval(str);

		return character;

	}

	public QString qTrimr(String source) {
		return qTrimr(qBox(source));
	}

	public QString qTrimr(QString source) {

		String str = source.trimR();
		int length = str.length();
		QCharacter character = dataContext.getDataFactory().createCharacter(length, false, true);
		character.eval(str);

		return character;
	}

	public QString qCat(String string1, String string2) {
		return qCat(qBox(string1), qBox(string1));
	}

	public QString qCat(QString string1, QString string2) {

		String str = string1.trimR() + " " + string2.toString();
		int length = str.length();
		QCharacter character = dataContext.getDataFactory().createCharacter(length, false, true);
		character.eval(str);

		return character;
	}

	public QString qBcat(String string1, String string2) {
		return qBcat(qBox(string1), qBox(string1));
	}

	public QString qBcat(QString string1, QString string2) {

		String str = string1.trimR() + " " + string2.toString();
		int length = str.length();
		QCharacter character = dataContext.getDataFactory().createCharacter(length, false, true);
		character.eval(str);

		return character;
	}

	public QString qTcat(String string1, String string2) {
		return qTcat(qBox(string1), qBox(string1));

	}

	public QString qTcat(QString string1, QString string2) {

		String str = string1.trimR() + string2.toString();
		int length = str.length();
		QCharacter character = dataContext.getDataFactory().createCharacter(length, false, true);
		character.eval(str);

		return character;
	}

	/*
	 * Replicate definition of qSubst for %SST CL function implementation
	 */
	public QString qSst(String string1, QNumeric startIndex, QNumeric length) {

		return qSubst(string1, startIndex.asInteger(), length.asInteger());

	}

	public QString qXlate(String oldString, String newString, QString source) {
		// TODO
		/*
		 * Verify with il-data
		 */
		StringBuffer sb = new StringBuffer();
		int startId = 1;
		int start = 1;
		for (char c : source.s().toCharArray()) {
			int i = oldString.indexOf(c);
			if (startId >= start && (newString.length() >= i && i >= 0)) {
				sb.append(newString.substring(i, i + 1));
			} else {
				sb.append(c);
			}
			startId++;
		}

		QCharacter string = dataContext.getDataFactory().createCharacter(source.getLength(), false, true);
		string.eval(sb.toString());

		return string;
	}

	public void qXfoot(QArray<QDecimal> list, QNumeric target) {
		target.clear();
		for (QDecimal element : list) {
			target.plus(element);
		}
	}

	/* Abs */
	public QNumeric qAbs(QNumeric numeric) {
		return qBox(Math.abs(numeric.asDouble()));
	}

	public QDataFiller qAll(byte numeric) {
		return this.dataFiller.set(qBox(numeric));
	}

	public QDataFiller qAll(QString string) {
		return this.dataFiller.set(string);
	}

	public QDataFiller qAll(String string) {
		return this.dataFiller.set(qBox(string));
	}

	public QDataFiller qAll(int numeric) {
		return this.dataFiller.set(qBox(numeric));
	}

	public QDataFiller qAll(QNumeric numeric) {
		return this.dataFiller.set(numeric);
	}

	public QNumeric qAbs(Integer numeric) {
		return qBox(Math.abs(numeric));
	}

	/* Elem */
	public QNumeric qElem(QList<? extends QBufferedData> list) {

		// TODO Unsigned
		QDecimal decimal = createDecimal(list.capacity());

		return decimal;
	}

	/* Elem */
	public QNumeric qElem(List<?> list) {

		// TODO Unsigned
		QDecimal decimal = createDecimal(list.size());

		return decimal;
	}

	/* Len */
	public QDecimal qLen(QBufferedData bufferedData) {
		return createDecimal(bufferedData.getLength());
	}

	public QDecimal qLen(String string) {
		return createDecimal(string.length());
	}

	private QDecimal createDecimal(int length) {

		QDecimal decimal = null;
		if (length >= 0 && length <= 9)
			decimal = dataContext.getDataFactory().createDecimal(1, 0, DecimalType.ZONED, true);
		else if (length >= 10 && length <= 99)
			decimal = dataContext.getDataFactory().createDecimal(2, 0, DecimalType.ZONED, true);
		else if (length >= 100 && length <= 999)
			decimal = dataContext.getDataFactory().createDecimal(3, 0, DecimalType.ZONED, true);
		else if (length >= 1000 && length <= 9999)
			decimal = dataContext.getDataFactory().createDecimal(4, 0, DecimalType.ZONED, true);
		else
			decimal = dataContext.getDataFactory().createDecimal(5, 0, DecimalType.ZONED, true);

		decimal.eval(length);

		return decimal;
	}

	/* Lookup */
	public QNumeric qLookup(DataSpecial argument, QArray<?> list, Integer startIndex, Integer numElements) {
		return qLookup(LookupOperator.EQ, argument, list, startIndex, numElements);
	}

	public QNumeric qLookupEQ(QBufferedElement argument, QArray<?> list, QDecimal startIndex, Integer numElements) {
		return qLookup(LookupOperator.EQ, argument, list, startIndex, numElements);
	}

	public QNumeric qLookup(QBufferedElement argument, QArray<?> list, Integer startIndex, Integer numElements) {
		return qLookup(LookupOperator.EQ, argument, list, startIndex, numElements);
	}

	public QDecimal qLookup(String argument, QList<? extends QBufferedData> list, Integer startIndex, Integer numElements) {
		return qLookup(LookupOperator.EQ, argument, list, startIndex, numElements);
	}

	public QDecimal qLookup(QDataStruct argument, QStroller<? extends QBufferedData> list, Integer startIndex, Integer numElements) {
		return qLookup(LookupOperator.EQ, argument.toString(), list, startIndex, numElements);
	}

	public QDecimal qLookuplt(DataSpecial argument, QArray<?> list, Integer startIndex, Integer numElements) {
		return qLookup(LookupOperator.LT, argument, list, startIndex, numElements);
	}

	public QDecimal qLookuplt(QBufferedElement argument, QArray<?> list, Integer startIndex, Integer numElements) {
		return qLookup(LookupOperator.LT, argument, list, startIndex, numElements);
	}

	public QDecimal qLookuple(DataSpecial argument, QArray<?> list, Integer startIndex, Integer numElements) {
		return qLookup(LookupOperator.LE, argument, list, startIndex, numElements);
	}

	public QDecimal qLookuple(QBufferedElement argument, QArray<?> list, Integer startIndex, Integer numElements) {
		return qLookup(LookupOperator.LE, argument, list, startIndex, numElements);
	}

	public QDecimal qLookupgt(DataSpecial argument, QArray<?> list, Integer startIndex, Integer numElements) {
		return qLookup(LookupOperator.GT, argument, list, startIndex, numElements);
	}

	public QDecimal qLookupgt(QBufferedElement argument, QArray<?> list, Integer startIndex, Integer numElements) {
		return qLookup(LookupOperator.GT, argument, list, startIndex, numElements);
	}

	public QDecimal qLookupge(DataSpecial argument, QArray<?> list, Integer startIndex, Integer numElements) {
		return qLookup(LookupOperator.GE, argument, list, startIndex, numElements);
	}

	public QDecimal qLookupge(QBufferedElement argument, QArray<?> list, Integer startIndex, Integer numElements) {
		return qLookup(LookupOperator.GE, argument, list, startIndex, numElements);
	}

	private QDecimal qLookup(LookupOperator operator, String argument, QList<? extends QBufferedData> list, Integer startIndex, Integer numElements) {

		if (startIndex == null)
			startIndex = 1;

		if (numElements == null)
			numElements = list.capacity();

		QDecimal result = null;
		for (int i = startIndex; i <= numElements; i++) {
			if (list.get(i).toString().trim().equals(argument.toString().trim())) {
				result = qBox(i);
				break;
			}
		}

		if (result == null)
			result = qBox(0);

		this.dataContext.found().eval(result.ge(1));

		return result;
	}

	private QDecimal qLookup(LookupOperator operator, QBufferedElement argument, QArray<?> list, Integer startIndex, Integer numElements) {
		
		if (startIndex == null)
			startIndex = 1;

		if (numElements == null)
			numElements = list.capacity();

		QDecimal result = null;
		for (int i = startIndex; i <= numElements; i++) {
			if (list.get(i).eq(argument)) {
				result = qBox(i);
				break;
			}
		}

		if (result == null)
			result = qBox(0);

		this.dataContext.found().eval(result.ge(1));

		return result;
	}

	private QDecimal qLookup(LookupOperator operator, QBufferedElement argument, QArray<?> list, QNumeric startIndex, Integer numElements) {

		if (startIndex == null)
			throw new IntegratedLanguageDataRuntimeException("Unexpected condition wsoerbwe7r6vwert");

		if (numElements == null)
			numElements = list.capacity();

		QDecimal result = null;
		for (int i = startIndex.i(); i <= numElements; i++) {
			if (list.get(i).eq(argument)) {
				result = qBox(i);
				break;
			}
		}

		if (result == null)
			result = qBox(0);

		this.dataContext.found().eval(result.ge(1));

		startIndex.eval(result);

		return result;
	}

	private QDecimal qLookup(LookupOperator operator, DataSpecial argument, QArray<?> list, Integer startIndex, Integer numElements) {

		if (startIndex == null)
			startIndex = 1;

		if (numElements == null)
			numElements = list.capacity();

		QDecimal result = null;
		for (int i = startIndex; i <= numElements; i++) {
			if (list.get(i).eq(argument)) {
				result = qBox(i);
				break;
			}
		}

		if (result == null)
			result = qBox(0);

		this.dataContext.found().eval(result.ge(1));

		return result;
	}

	/* Scan */
	public QDecimal qScan(byte argument, QString source) {
		return qScan(argument, source, null, null);
	}

	public QDecimal qScan(byte argument, QString source, Integer start) {
		return qScan(argument, source, start, null);
	}

	// TODO double byte?
	public QDecimal qScan(byte argument, QString source, Integer start, Integer length) {

		if (start == null)
			start = 1;

		int position = 0;

		if (length != null)
			position = qSubst(source, 1, length).toString().indexOf(argument, start - 1) + 1;
		else
			// TODO encoding?
			position = source.asString().indexOf(argument, start - 1) + 1;

		return qBox(position);
	}

	public QDecimal qScan(String argument, QString source) {
		return qScan(argument, source, null, null);
	}

	public QDecimal qScan(String argument, QString source, Integer start) {
		return qScan(argument, source, start, null);
	}

	public QDecimal qScan(String argument, QString source, Integer start, Integer length) {

		if (start == null)
			start = 1;

		int position = 0;

		if (length != null)
			position = qSubst(source, 1, length).toString().indexOf(argument, start - 1) + 1;
		else
			position = source.toString().indexOf(argument, start - 1) + 1;

		return qBox(position);
	}

	/* Substring */
	public QCharacter qSubst(QArray<QCharacter> source, Integer startIndex) {
		return qSubst(source, startIndex, null);
	}

	public QCharacter qSubst(QArray<QCharacter> source, Integer startIndex, Integer length) {

		if (startIndex == null)
			startIndex = 1;

		if (length == null)
			length = source.getLength() - startIndex;

		QCharacter string = dataContext.getDataFactory().createCharacter(length, false, false);
		source.assign(string, startIndex);

		return string;

	}

	public QCharacter qSubst(QString source, Integer startIndex) {
		return qSubst(source, startIndex, null);
	}

	public QCharacter qSubst(QString source, Integer startIndex, Integer length) {
		return source.qSubst(startIndex, length);
	}

	public QCharacter qSubst(String source, Integer startIndex, Integer length) {

		if (startIndex == null)
			startIndex = 1;

		if (length == null)
			length = source.length() - startIndex;

		String str = source.substring(startIndex - 1, startIndex - 1 + length);

		QCharacter string = dataContext.getDataFactory().createCharacter(str.length(), false, true);
		string.eval(str);

		return string;
	}

	public <P extends Object> P bindProcedure(Object owner, Class<P> klass) {
		return injector.prepareProcedure(owner, klass);
	}

	public QDatetime qDate() {
		// TODO Auto-generated method stub
		return null;
	}

	public QDatetime qDate(QString value) {
		// TODO Auto-generated method stub
		return null;
	}

	// TODO remove return value
	public QNumeric qTime(QDatetime datetime) {

		return null;
	}

	public void qTime(QNumeric datetime) {

		Calendar CALENDAR = Calendar.getInstance();
		if (datetime.getLength() == 14) {
			datetime.eval(Long.parseLong(new SimpleDateFormat("HHmmssddMMyyyy").format(CALENDAR.getTime())));
		} else if (datetime.getLength() == 12) {
			datetime.eval(Long.parseLong(new SimpleDateFormat("HHmmssddMMyy").format(CALENDAR.getTime())));
		} else if (datetime.getLength() == 6) {
			datetime.eval(Long.parseLong(new SimpleDateFormat("HHmmss").format(CALENDAR.getTime())));
		} else
			System.err.println("Unknown length: " + datetime.getLength());
	}

	public QPointer qPointer(String string) {
		return qBox(string).qAddr();
	}

	public QPointer qPointer(QCharacter string) {
		return string.qAddr();
	}

	public QArray<QCharacter> qArray(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
