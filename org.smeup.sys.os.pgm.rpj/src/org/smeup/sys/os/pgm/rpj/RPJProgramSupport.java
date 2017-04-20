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

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.smeup.sys.il.core.QThread;
import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.il.data.DataComparator;
import org.smeup.sys.il.data.DataSpecial;
import org.smeup.sys.il.data.DatetimeFormat;
import org.smeup.sys.il.data.QArray;
import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QBufferedList;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QData;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataFiller;
import org.smeup.sys.il.data.QDatetime;
import org.smeup.sys.il.data.QDecimal;
import org.smeup.sys.il.data.QIndicator;
import org.smeup.sys.il.data.QIntegratedLanguageDataFactory;
import org.smeup.sys.il.data.QList;
import org.smeup.sys.il.data.QNumeric;
import org.smeup.sys.il.data.QPointer;
import org.smeup.sys.il.data.QString;
import org.smeup.sys.il.data.SortDirection;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Module;
import org.smeup.sys.il.data.annotation.Module.Scope;
import org.smeup.sys.il.data.annotation.Overlay;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.def.BinaryType;
import org.smeup.sys.il.data.def.DateFormat;
import org.smeup.sys.il.data.def.DatetimeType;
import org.smeup.sys.il.data.def.DecimalType;
import org.smeup.sys.il.data.def.QCharacterDef;
import org.smeup.sys.il.data.def.QIntegratedLanguageDataDefFactory;
import org.smeup.sys.il.data.def.TimeFormat;
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

@Module(name = "*RPJ", scope = Scope.OWNER)
public class RPJProgramSupport extends RPJModule {
	private static final long serialVersionUID = 1L;

	@Inject
	private transient RPJProgramInjector injector;
	@Inject
	private transient QDataContext dataContext;
	@Inject
	private transient QProgramManager programManager;
	@Inject
	private transient QResourceManager resourceManager;
	@Inject
	public transient QJob job;
	@Inject
	@Program(name = "*OWNER")
	private transient Object programOwner;

	// public static boolean FALSE = false;
	public static final boolean TRUE = true;
	public transient static Specials qSP;

	@Overlay(name = "*PGMSTATUS")
	private transient RPJProgramStatus programStatus;

	private transient QDataFiller dataFiller;
	private transient QResourceReader<QProgram> programReader;
	private transient RPJProgramCache programCache;
	private transient int countRunnable = 0;

	@DataDef
	public QIndicator qINLR;
	@DataDef
	public QIndicator qINOF;
	@DataDef
	public QIndicator qINRT;

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
	public QIndicator qINH1;
	@DataDef
	public QIndicator qINH2;
	@DataDef
	public QIndicator qINH3;
	@DataDef
	public QIndicator qINH4;
	@DataDef
	public QIndicator qINH5;
	@DataDef
	public QIndicator qINH6;
	@DataDef
	public QIndicator qINH7;
	@DataDef
	public QIndicator qINH8;
	@DataDef
	public QIndicator qINH9;
	
	
	@DataDef
	public RPJProgramDate qDATESYS;

	@DataDef(length = 1024)
	public QCharacter qLDA;

	@DataDef(dimension = 99, length = 1)
	public QArray<QIndicator> qIN;

	public Object getProgramOwner() {
		return this.programOwner;
	}

	@PostConstruct
	private void init() {

		@SuppressWarnings("resource")
		QContext jobContext = job.getContext();

		dataFiller = QIntegratedLanguageDataFactory.eINSTANCE.createDataFiller();
		programReader = resourceManager.getResourceReader(job, QProgram.class, org.smeup.sys.il.memo.Scope.LIBRARY_LIST);

		programCache = jobContext.get(RPJProgramCache.class);
		if (programCache == null)
			synchronized (job) {
				programCache = jobContext.get(RPJProgramCache.class);
				if (programCache == null) {
					programCache = new RPJProgramCache();
					jobContext.set(RPJProgramCache.class, programCache);
				}
			}
	}

	public boolean qRunnable() {
		if (countRunnable == 5000) {
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

		public static final DataSpecial NULL = DataSpecial.NULL;
		public static final DataSpecial OMIT = DataSpecial.OMIT;

		public static final DataSpecial OFF = DataSpecial.OFF;
		public static final DataSpecial ON = DataSpecial.ON;
		public static final DataSpecial ZERO = DataSpecial.ZERO;
		public static final DataSpecial ZEROS = DataSpecial.ZEROS;
		public static final DataSpecial BLANK = DataSpecial.BLANK;
		public static final DataSpecial BLANKS = DataSpecial.BLANKS;
		public static final DataSpecial LOVAL = DataSpecial.LOVAL;
		public static final DataSpecial HIVAL = DataSpecial.HIVAL;

		public static final DatetimeFormat ISO = DatetimeFormat.ISO;
		public static final DatetimeFormat ISO0 = DatetimeFormat.ISO0;
		public static final DatetimeFormat MS = DatetimeFormat.MILLISECONDS;
		public static final DatetimeFormat Y = DatetimeFormat.YEAR;
		public static final DatetimeFormat YEARS = DatetimeFormat.YEARS;
		public static final DatetimeFormat M = DatetimeFormat.MONTH;
		public static final DatetimeFormat MONTHS = DatetimeFormat.MONTHS;
		public static final DatetimeFormat D = DatetimeFormat.DAY;
		public static final DatetimeFormat DAYS = DatetimeFormat.DAYS;
		public static final DatetimeFormat SECOND = DatetimeFormat.SECOND;
		public static final DatetimeFormat SECONDS = DatetimeFormat.SECONDS;

		public static final DataComparator EQ = DataComparator.EQUAL;
		public static final DataComparator LT = DataComparator.LESS_THAN;
		public static final DataComparator LE = DataComparator.LESS_THAN_EQUAL;
		public static final DataComparator GT = DataComparator.GREATER_THAN;
		public static final DataComparator GE = DataComparator.GREATER_THAN_EQUAL;
		public static final DataComparator NE = DataComparator.NOT_EQUAL;
	}

	/*
	 * public QBufferedData qBox(Enum<?> label) { return null; }
	 */

	public QNumeric qBitand(int expression, byte expression2) {
		// TODO Auto-generated method stub
		return null;
	}

	public QDecimal qBitand(Number expression, QDecimal expression2) {
		return null;
	}

	public QDecimal qBitnot(Number expression) {
		return null;
	}

	public QDecimal qBitxor(Number expression, QDecimal expression2) {
		return null;
	}

	public QIndicator qBox(boolean boolean_) {

		QIndicator qIndicator = dataContext.getDataFactory().createIndicator(true);
		qIndicator.eval(boolean_);

		return qIndicator;
	}

	public QIndicator qBoxBoolean(String value) {

		QIndicator qIndicator = dataContext.getDataFactory().createIndicator(true);
		qIndicator.eval(value);

		return qIndicator;
	}

	public QBinary qBoxBinary(long value) {

		BinaryType type = null;

		if (value <= Byte.MAX_VALUE)
			type = BinaryType.BYTE;
		else if (value <= Short.MAX_VALUE)
			type = BinaryType.SHORT;
		else if (value <= Integer.MAX_VALUE)
			type = BinaryType.INTEGER;
		else
			type = BinaryType.LONG;

		QBinary binary = dataContext.getDataFactory().createBinary(type, false, true);
		binary.eval(value);

		return binary;
	}

	public QDecimal qBox(Short decimal) {
		return qBox((long) decimal);
	}
	
	public QDecimal qBox(Integer decimal) {
		return qBox((long) decimal);
	}

	public QDecimal qBox(Long decimal) {

		QDecimal qDecimal = null;

		if (decimal == null)
			qDecimal = dataContext.getDataFactory().createDecimal(0, 0, DecimalType.ZONED, false);
		else if (Math.abs(decimal) >= 0 && Math.abs(decimal) <= 99999)
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

	public QCharacter qBox(String characters) {

		QCharacter qCharacter = null;
		if (characters == null)
			qCharacter = dataContext.getDataFactory().createCharacter(0, false, false);
		else {
			// TODO use cache
			qCharacter = dataContext.getDataFactory().createCharacter(characters.length(), false, true);
			qCharacter.eval(characters);
		}

		return qCharacter;
	}

	public QString qBoxString(byte b) {
		return qBox(b);
	}

	public QString qBoxString(boolean b) {
		return qBox(b);
	}

	public QCharacter qBox(byte character) {

		QCharacter qCharacter = dataContext.getDataFactory().createCharacter(1, false, true);
		qCharacter.eval(character);

		return qCharacter;
	}

	public QArray<QCharacter> qBoxArray(String characters) {

		QCharacterDef argument = QIntegratedLanguageDataDefFactory.eINSTANCE.createCharacterDef();
		argument.setLength(characters.length());
		QArray<QCharacter> array = dataContext.getDataFactory().createArray(argument, 1, SortDirection.ASCEND, true);
		array.get(1).eval(characters);

		return array;
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
			else {
				if(e.getCause() != null){
					System.err.println(e.getMessage() + " - " +  e.getCause().getMessage());
					throw new OperatingSystemMessageException("00211", e.getMessage() + " - " +  e.getCause().getMessage(), 40);
				}else{
					System.err.println(e.getMessage());
					throw new OperatingSystemMessageException("00211", e.getMessage(), 40);
				}
				
			}
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

	private QProgram getProgram(String name) {

		QProgram program = programCache.get(name);
		if (program == null) {
			program = programReader.lookup(name);
			if (program == null)
				throw new OperatingSystemRuntimeException("Program not found: " + name);

			programCache.put(name, program);
		}

		return program;
	}

	public QString qChar(QCharacter character) {
		return qChar(character, null);
	}

	public QString qChar(QCharacter character, String format) {
		// TODO
		return character;
	}

	public QString qChar(QNumeric numeric) {
		return qChar(numeric, null);
	}

	public QString qChar(QNumeric numeric, String format) {
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

	public QString qChar(QDatetime datetime) {
		return qChar(datetime, null);
	}

	public QString qChar(QDatetime datetime, DatetimeFormat format) {

		QCharacter character = dataContext.getDataFactory().createCharacter(19, true, true);
		character.eval(Long.toString(datetime.asTime()));

		return character;
	}

	public QDecimal qDec(QNumeric numeric, Integer precision, Integer scale) {
		return null;
	}

	public QDecimal qDec(QDatetime date, Integer precision, Integer scale) {

		// TODO verify me
		if (precision == null)
			precision = 20;
		
		if (scale == null)
			scale = 0;
		
		QDecimal decimal = dataContext.getDataFactory().createDecimal(precision, scale, DecimalType.PACKED, true);
		
		decimal.movel(date.toString().replaceAll("[-//:.]", ""));
		
		return decimal;
	}

	public QDecimal qDec(QString string, Integer precision, Integer scale) {
		return qDec(string.s(), precision, scale);
	}

	public QDecimal qDec(String string, Integer precision, Integer scale) {

		QDecimal decimal = dataContext.getDataFactory().createDecimal(precision, scale, DecimalType.PACKED, true);

		// TODO use number format
		string = string.replaceAll(",", ".").trim();
		if (!string.isEmpty())
			decimal.eval(Double.parseDouble(string));

		return decimal;
	}

	public QDatetime qAdddur(QDatetime op1, QDecimal op2, Enum<?> format) {
		return null;
	}

	public QDatetime qSubdur(QDatetime op1, QDecimal op2, Enum<?> format) {
		return null;
	}

	public void qDisplay(QString text) {
		System.out.println(text);
	}
	
	public QCharacter qEditc(double numeric, String format) {
		return qEditc(qBox(numeric), format);
	}

	public QCharacter qEditc(int numeric, String format) {
		return qEditc(qBox(numeric), format);
	}

	public QCharacter qEditc(QNumeric numeric, String format) {
		QCharacter character = dataContext.getDataFactory().createCharacter(numeric.getLength(), false, true);
		try {

			switch (format) {
			case "J":
			case "K":
				character = dataContext.getDataFactory().createCharacter(50, false, true);				
				if(format.equals("K") && numeric.isEmpty()){
					character.clear();
					return character;
				}
				character.movel(editString(numeric, true, "S"));
				break;
			case "L":
			case "M":
				character = dataContext.getDataFactory().createCharacter(50, false, true);				
				if(format.equals("M") && numeric.isEmpty()){
					character.clear();
					return character;
				}
				character.movel(editString(numeric, false, "S"));
				break;
			case "N":
			case "O":
				character = dataContext.getDataFactory().createCharacter(50, false, true);				
				if(format.equals("O") && numeric.isEmpty()){
					character.clear();
					return character;
				}
				character.movel(editString(numeric, false, "P"));
				break;
			case "P":
			case "Q":
				character = dataContext.getDataFactory().createCharacter(50, false, true);				
				if(format.equals("Q") && numeric.isEmpty()){
					character.clear();
					return character;
				}
				character.movel(editString(numeric, false, "P"));
				break;
			case "X":
				character.move(numeric);
				break;
			case "Z":
				character = dataContext.getDataFactory().createCharacter(50, false, true);				
				if(numeric.isEmpty()){
					character.clear();
					return character;
				}
				character.eval(Integer.toString(numeric.i()).replaceAll("^0+", ""));
				break;
			case "1":
			case "2":
				character = dataContext.getDataFactory().createCharacter(50, false, true);				
				if(format.equals("2") && numeric.isEmpty()){
					character.clear();
					return character;
				}
				character.movel(editString(numeric, true, ""));
				break;
			case "3":
			case "4":
				character = dataContext.getDataFactory().createCharacter(50, false, true);				
				if(format.equals("4") && numeric.isEmpty()){
					character.clear();
					return character;
				}
				character.movel(editString(numeric, false, ""));
				break;
			default:
				System.err.println("Invalid edit format: " + format);
				character.eval(Integer.toString(numeric.asInteger()).replaceAll("^0+", ""));
				break;
			}
		} catch (Exception e) {
			System.err.println("Invalid format: " + format + " " + numeric);
		}

		return character;
	}
	
	private String editString(QNumeric numeric, boolean group, String negative) {
		int length = numeric.getLength();
		int scale = 0;
		if (numeric instanceof QDecimal) {
			QDecimal decimal = (QDecimal) numeric;
			scale = decimal.getScale();
		}
		// TODO
		DecimalFormat numberFormat = (DecimalFormat) NumberFormat.getInstance(Locale.ITALIAN);
		numberFormat.setMinimumIntegerDigits(length - scale);
		numberFormat.setMinimumFractionDigits(scale);
		numberFormat.setGroupingUsed(group);
		numberFormat.setNegativePrefix("");
		numberFormat.setNegativeSuffix("");

		if (numeric.lt(0)) {
			switch (negative) {
			case "S":
				numberFormat.setNegativeSuffix("-");
				break;
			case "P":
				numberFormat.setNegativePrefix("-");
				break;
			}
		}

		// TODO Regex
		// Remove leading zeros and separator
		StringBuffer sb = new StringBuffer();
		boolean comma = false;
		boolean separator = false;
		
		char[] chars = numberFormat.format(numeric.asDouble()).toCharArray();
		for(int i=0; i<chars.length; i++){
			if(chars[i] == '0'){
				if(!comma && !separator && chars.length!=i+1)
					sb.append(" ");
				else
					sb.append(chars[i]);
			}
			else if(chars[i] == numberFormat.getDecimalFormatSymbols().getGroupingSeparator()){
				if(!separator)
					sb.append(" ");
				else
					sb.append(chars[i]);
			}
			else if(chars[i] == numberFormat.getDecimalFormatSymbols().getDecimalSeparator()){
				comma = true;
				if(!separator)
					sb.replace(i-1, i, "0");
				sb.append(chars[i]);
			} else{
				separator = true ;
				sb.append(chars[i]);
			}
		}
		return sb.toString();
	}

	

	public QCharacter qEditw(QNumeric numeric, String format) {
		// TODO
		QCharacter character = null;
		int scale = 0;
		if (numeric instanceof QDecimal) {
			QDecimal decimal = (QDecimal) numeric;
			scale = decimal.getScale();
		}
		
		if (numeric.getLength() == 1) {
			character = dataContext.getDataFactory().createCharacter(numeric.getLength(), false, true);
			character.eval(Integer.toString(numeric.asInteger()));
		} else {
			if(scale == 0){
				character = dataContext.getDataFactory().createCharacter(numeric.getLength(), false, true);
				character.eval(Long.toString(numeric.asLong()));
			}else{
				character = dataContext.getDataFactory().createCharacter(numeric.getLength(), true, true);
				character.eval(Double.toString(numeric.asDouble()).replaceAll("\\.", ""));
			}
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

	public QIndicator qEqual(QArray<?> array) {
		return array.qEqual();
	}

	public QIndicator qEqual(QDataSet<?> dataSet) {
		return qBox(dataSet.isEqual());
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

	public QPointer qAlloc(Number size) {
		return dataContext.getDataFactory().createPointer(size.intValue());
	}

	public QPointer qRealloc(QPointer pointer, QNumeric size) {
		return qRealloc(pointer, size.asInteger());
	}

	public QPointer qRealloc(QPointer pointer, Number size) {
		return dataContext.getDataFactory().createPointer(pointer, size.intValue());
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

	public QString qReplace(String replacement, String source, Number from, Number length) {

		if (from == null)
			from = 1;

		if (length == null)
			if (replacement.length() > source.length())
				length = source.length();
			else
				length = replacement.length();

		int startPos = from.intValue() + length.intValue() - 1;

		StringBuffer sb = new StringBuffer();
		sb.append(source.substring(0, from.intValue() - 1));
		sb.append(replacement);
		if (startPos <= source.length())
			sb.append(source.substring(from.intValue() + length.intValue() - 1));

		// TODO cache
		QCharacter character = dataContext.getDataFactory().createCharacter(sb.length(), false, true);
		character.eval(sb.toString());

		return character;
	}

	public QArray<?> qSubarr(QArray<?> array, int start, int elements) {

		return array.qSubarr(start, elements);
	}

	public QString qCat(String string1, String string2) {
		return qCat(qBox(string1), qBox(string1));
	}

	public QString qCat(QString string1, QString string2) {

		// String str = string1.trimR() + " " + string2.toString();
		String str = string1 + string2.toString();
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

	public QCharacter qXlate(String oldString, String newString, QString source) {
		// TODO
		/*
		 * Verify with il-data
		 */
		StringBuffer sb = new StringBuffer();
		int startId = 1;
		int start = 1;
		for (char c : source.s().toCharArray()) {
			int i = oldString.indexOf(c);
			if (startId >= start && (newString.length() >= i && i >= 0))
				sb.append(newString.substring(i, i + 1));
			else
				sb.append(c);
			startId++;
		}

		QCharacter string = dataContext.getDataFactory().createCharacter(source.getLength(), false, true);
		string.eval(sb.toString());

		return string;
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

	/* Scan */
	public QDecimal qScan(byte argument, QString source) {
		return qScan(argument, source, null, null);
	}

	public QDecimal qScan(byte argument, QString source, Number start) {
		return qScan(argument, source, start, null);
	}

	// TODO double byte?
	public QDecimal qScan(byte argument, QString source, Number start, Number length) {

		if (start == null)
			start = 1;

		int position = 0;

		if (length != null)
			position = qSubst(source, 1, length).toString().indexOf(argument, start.intValue() - 1) + 1;
		else
			// TODO encoding?
			position = source.asString().indexOf(argument, start.intValue() - 1) + 1;

		return qBox(position);
	}

	public QDecimal qScan(String argument, QString source) {
		return qScan(argument, source, null, null);
	}

	public QDecimal qScan(String argument, QString source, Number start) {
		return qScan(argument, source, start, null);
	}

	public QDecimal qScan(String argument, QString source, Number start, Number length) {

		if (start == null)
			start = 1;

		int position = 0;

		if (length != null)
			position = qSubst(source, 1, length).toString().indexOf(argument, start.intValue() - 1) + 1;
		else
			position = source.toString().indexOf(argument, start.intValue() - 1) + 1;

		return qBox(position);
	}

	public QCharacter qSubst(QString source, Number startIndex) {
		return qSubst(source, startIndex, null);
	}

	public QCharacter qSubst(QString source, Number startIndex, Number length) {
		return source.qSubst(startIndex, length);
	}

	public QCharacter qSubst(String source, Number startIndex, Number length) {

		if (startIndex == null)
			startIndex = 1;

		if (length == null)
			length = source.length() - startIndex.intValue();

		String str = source.substring(startIndex.intValue() - 1, startIndex.intValue() - 1 + length.intValue());

		QCharacter string = dataContext.getDataFactory().createCharacter(str.length(), false, true);
		string.eval(str);

		return string;
	}

	public <P extends Object> P bindProcedure(Object owner, Class<P> klass) {
		return injector.prepareProcedure(owner, klass);
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

	public QNumeric qTime() {
		// TODO Auto-generated method stub
		return null;
	}

	public QDatetime qTimestamp() {
		QDatetime dateTime = dataContext.getDataFactory().createDate(DatetimeType.TIME_STAMP, DateFormat.ISO, TimeFormat.ISO, true);
		dateTime.time();
		return dateTime;
	}

	public QDatetime qTimestamp(QNumeric datetime) {
		return null;
	}
	
	public QNumeric qDate() {
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
		if (datetime.getLength() == 14)
			datetime.eval(Long.parseLong(new SimpleDateFormat("HHmmssddMMyyyy").format(CALENDAR.getTime())));
		else if (datetime.getLength() == 12)
			datetime.eval(Long.parseLong(new SimpleDateFormat("HHmmssddMMyy").format(CALENDAR.getTime())));
		else if (datetime.getLength() == 6)
			datetime.eval(Long.parseLong(new SimpleDateFormat("HHmmss").format(CALENDAR.getTime())));
		else
			System.err.println("Unknown length: " + datetime.getLength());
	}

	public void qExcept(String string) {
		// TODO Auto-generated method stub

	}

	public QIndicator qSwitch(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public QNumeric qBitxor(int i, QBinary qBinary) {
		// TODO Auto-generated method stub
		return null;
	}

	public QNumeric qBitxor(Number asNumber, QBinary abufchar) {
		// TODO Auto-generated method stub
		return null;
	}
}
