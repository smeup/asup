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
package org.smeup.sys.os.file.base;

import java.util.List;

import org.smeup.sys.il.data.DataSpecial;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataStruct;
import org.smeup.sys.il.data.QDataWriter;
import org.smeup.sys.il.data.QIndicator;
import org.smeup.sys.il.data.QIntegratedLanguageDataFactory;
import org.smeup.sys.il.data.QNumeric;
import org.smeup.sys.il.data.QRecord;
import org.smeup.sys.il.data.QString;
import org.smeup.sys.il.esam.AccessMode;
import org.smeup.sys.il.esam.QSMDataSet;
import org.smeup.sys.os.file.QFileMember;
import org.smeup.sys.os.file.QFileMemberRow;

public class BaseFileMemberDataSetImpl<R extends QRecord> implements QSMDataSet<R> {

	private QDataContext dataContext;
	private BaseFileMemberProvider fileMemberProvider;
	private R record;
	
	private QFileMember fileMember;

	private boolean open = false;
	private int currentPosition = 0;
	private BaseInfoStruct infoStruct;
	private QDataWriter dataWriter;

	public BaseFileMemberDataSetImpl(BaseFileMemberProvider fileMemberProvider, R record, AccessMode accessMode, boolean userOpen, BaseInfoStruct infoStruct, QDataContext dataContext) {
		this.dataContext = dataContext;
		this.fileMemberProvider = fileMemberProvider;
		this.record = record;
		this.infoStruct = infoStruct;
		
		this.dataWriter = QIntegratedLanguageDataFactory.eINSTANCE.createDataWriter();
	}

	@Override
	public QString getFilePath() {
		return fileMemberProvider.getFilePath();
	}

	@Override
	public QString getMemberName() {
		return fileMemberProvider.getMemberName();
	}

	@Override
	public boolean chain(QNumeric relativeRecordNumber, Boolean lock) {
		return chain(relativeRecordNumber.asInteger(), null);
	}

	@Override
	public boolean chain(int relativeRecordNumber) {
		return chain(relativeRecordNumber, null);
	}

	@Override
	public boolean chain(int relativeRecordNumber, QIndicator notFound) {
		return chain(relativeRecordNumber, notFound, null);
	}

	@Override
	public boolean chain(int relativeRecordNumber, QIndicator notFound, Boolean lock) {
		return chain(relativeRecordNumber, notFound, null, lock);
	}

	@Override
	public boolean chain(int relativeRecordNumber, QIndicator notFound, QIndicator error, Boolean lock) {

		QFileMember fileMember = getFileMember();

		for (int i = 1; i <= fileMember.getRows().size(); i++) {
			if (i == relativeRecordNumber) {

				setRecord(fileMember.getRows().get(i - 1));

				return true;
			}
		}

		return false;
	}

	@Override
	public boolean chain(QNumeric relativeRecordNumber) {
		return chain(relativeRecordNumber.asInteger());
	}

	@Override
	public boolean chain(QNumeric relativeRecordNumber, QIndicator notFound) {
		return chain(relativeRecordNumber.asInteger(), notFound);
	}

	@Override
	public boolean chain(QNumeric relativeRecordNumber, QIndicator notFound, Boolean lock) {
		return chain(relativeRecordNumber.asInteger(), notFound, lock);
	}

	@Override
	public boolean chain(QNumeric relativeRecordNumber, QIndicator notFound, QIndicator error) {
		return chain(relativeRecordNumber.asInteger(), notFound, error, null);
	}

	@Override
	public boolean chain(QNumeric relativeRecordNumber, QIndicator notFound, QIndicator error, Boolean lock) {
		return chain(relativeRecordNumber.asInteger(), notFound, error, lock);
	}

	@Override
	public void clear() {
		if (this.record != null)
			this.record.clear();
	}

	@Override
	public void close() {
		close(null);
	}

	@Override
	public void close(QIndicator error) {
		
		this.fileMember = null;
		this.open = false;
		this.currentPosition = 0;
	}

	@Override
	public R get() {
		return this.record;
	}

	private QFileMember getFileMember() {
		
		if(this.fileMember == null) 
			this.fileMember = this.fileMemberProvider.getFileMember(); 
		
		return this.fileMember;
	}

	@Override
	public QDataStruct getInfoStruct() {
		return this.infoStruct;
	}

	@Override
	public boolean isEndOfData() {
		return dataContext.endOfData().asBoolean();
	}

	@Override
	public boolean isEqual() {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean isFound() {
		return dataContext.found().asBoolean();
	}

	@Override
	public boolean isOpen() {
		return this.open;
	}

	@Override
	public boolean onError() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void open() {
		open(null);
	}

	@Override
	public void open(QIndicator error) {
		this.open = true;
		this.currentPosition = 0;
		getFileMember();
	}

	@Override
	public boolean read() {
		return read(null, null, null);
	}

	@Override
	public boolean read(QIndicator endOfData) {
		return read(endOfData, null, null);
	}

	@Override
	public boolean read(QIndicator endOfData, Boolean lock) {
		return read(endOfData, null, lock);
	}

	@Override
	public boolean read(QIndicator endOfData, QIndicator error) {
		return read(endOfData, error, null);
	}

	@Override
	public boolean read(QIndicator endOfData, QIndicator error, Boolean lock) {

		if (this.currentPosition >= getFileMember().getRows().size()) {
			if (endOfData != null)
				endOfData.eval(true);
			
			dataContext.endOfData().eval(true);
			dataContext.found().eval(false);
			return false;
		}

		this.currentPosition ++;

		try {
			QFileMemberRow fileMemberRow = getFileMember().getRows().get(this.currentPosition - 1);
			setRecord(fileMemberRow);
	
			if (endOfData != null)
				endOfData.eval(false);

			dataContext.endOfData().eval(false);
			dataContext.found().eval(true);
			return true;
		}
		catch (Exception e) {
			if(error != null)
				error.eval(true);
			
			dataContext.endOfData().eval(true);
			dataContext.found().eval(false);
			return false;
		}
	}

	@Override
	public boolean readp() {
		return readp(null, null, null);
	}

	@Override
	public boolean readp(QIndicator beginningOfData) {
		return readp(beginningOfData, null, null);
	}

	@Override
	public boolean readp(QIndicator beginningOfData, Boolean lock) {
		return readp(beginningOfData, null, lock);
	}

	@Override
	public boolean readp(QIndicator beginningOfData, QIndicator error) {
		return readp(beginningOfData, error, null);
	}

	@Override
	public boolean readp(QIndicator beginningOfData, QIndicator error, Boolean lock) {

		if (this.currentPosition <= 1) {
			if (beginningOfData != null)
				beginningOfData.eval(true);
			
			dataContext.endOfData().eval(true);
			dataContext.found().eval(false);
			return false;
		}

		this.currentPosition --;

		try {
	
			QFileMemberRow fileMemberRow = getFileMember().getRows().get(this.currentPosition - 1);
			setRecord(fileMemberRow);
	
			if (beginningOfData != null)
				beginningOfData.eval(false);
	
			dataContext.endOfData().eval(false);
			dataContext.found().eval(true);		
			return true;
		}
		catch (Exception e) {
			if(error != null)
				error.eval(true);
			
			dataContext.endOfData().eval(true);
			dataContext.found().eval(false);
			return false;
		}
	}

	@Override
	public void setgt(DataSpecial special) {
		
		switch (special) {
		case HIVAL:
			setgt(fileMember.getRows().size());
			break;
		case LOVAL:
			setgt(1);
			break;
		case NULL:
		case OFF:
		case OMIT:
		case ON:
		case ZERO:
		case ZEROS:
		case BLANK:
		case BLANKS:
			throw new UnsupportedOperationException();
		}
	}

	@Override
	public void setgt(int relativeRecordNumber) {
		setgt(relativeRecordNumber, null, null);
	}

	@Override
	public void setgt(int relativeRecordNumber, QIndicator notFound) {
		setgt(relativeRecordNumber, notFound, null);
	}

	@Override
	public void setgt(QNumeric relativeRecordNumber) {
		setgt(relativeRecordNumber.asInteger());
	}

	@Override
	public void setgt(QNumeric relativeRecordNumber, QIndicator notFound) {
		setgt(relativeRecordNumber.asInteger(), notFound, null);
	}

	@Override
	public void setgt(QNumeric relativeRecordNumber, QIndicator notFound, QIndicator error) {
		setgt(relativeRecordNumber.asInteger(), notFound, error);
	}

	@Override
	public void setgt(int relativeRecordNumber, QIndicator notFound, QIndicator error) {
		this.currentPosition = relativeRecordNumber + 1;
	}

	@Override
	public void setll(DataSpecial special) {
		
		switch (special) {
		case HIVAL:
			setll(fileMember.getRows().size());
			break;
		case LOVAL:
			setll(1);
			break;
		case NULL:
		case OFF:
		case OMIT:
		case ON:
		case ZERO:
		case ZEROS:
		case BLANK:
		case BLANKS:
			throw new UnsupportedOperationException();
		}
	}

	@Override
	public void setll(int relativeRecordNumber) {
		setll(relativeRecordNumber, null, null, null);
	}

	@Override
	public void setll(int relativeRecordNumber, QIndicator notFound) {
		setll(relativeRecordNumber, notFound, null, null);
	}

	@Override
	public void setll(int relativeRecordNumber, QIndicator notFound, QIndicator equal) {
		setll(relativeRecordNumber, notFound, equal, null);
	}

	@Override
	public void setll(QNumeric relativeRecordNumber) {
		setll(relativeRecordNumber.asInteger(), null, null, null);
	}

	@Override
	public void setll(QNumeric relativeRecordNumber, QIndicator notFound, QIndicator equal) {
		setll(relativeRecordNumber.asInteger(), notFound, equal, null);
	}

	@Override
	public void setll(int relativeRecordNumber, QIndicator notFound, QIndicator equal, QIndicator error) {
		this.currentPosition = relativeRecordNumber -1;
	}

	private void setRecord(QFileMemberRow fileMemberRow) {

		List<QBufferedData> elements = record.getElements();
		
		switch (elements.size()) {
		case 0:
			return;
		case 1:
			dataWriter.set(fileMemberRow.getSequence());
			elements.get(0).accept(dataWriter);
			return;
		case 2:
			dataWriter.set(fileMemberRow.getSequence());
			elements.get(0).accept(dataWriter);

			dataWriter.set(fileMemberRow.getDate());
			elements.get(1).accept(dataWriter);
			return;
		case 3:
			dataWriter.set(fileMemberRow.getSequence());
			elements.get(0).accept(dataWriter);

			dataWriter.set(fileMemberRow.getDate());
			elements.get(1).accept(dataWriter);

			dataWriter.set(fileMemberRow.getContent());
			elements.get(2).accept(dataWriter);
			return;
		}
	}

	@Override
	public void unlock() {
		unlock(null);
	}

	@Override
	public void unlock(QIndicator error) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void update() {
		update(null);
	}

	@Override
	public void update(QIndicator error) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void write() {
		write(null);
	}

	@Override
	public void write(QIndicator error) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean read(Boolean lock) {
		return read(null, null, lock);
	}

	@Override
	public boolean readp(Boolean lock) {
		return readp(null, null, lock);
	}

	@Override
	public void delete() {
		delete(null, null, null);
	}

	@Override
	public void delete(QIndicator error) {
		delete(null, null, error);
	}

	@Override
	public void delete(QNumeric relativeRecordNumber, QIndicator notFound) {
		delete(relativeRecordNumber, notFound, null);
	}

	@Override
	public void delete(QNumeric relativeRecordNumber, QIndicator notFound, QIndicator error) {
		throw new UnsupportedOperationException();
	}
}