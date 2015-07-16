package org.smeup.sys.os.file.base;

import org.smeup.sys.il.data.QDataWriter;
import org.smeup.sys.il.data.QIndicator;
import org.smeup.sys.il.data.QIntegratedLanguageDataFactory;
import org.smeup.sys.il.data.QNumeric;
import org.smeup.sys.il.data.QRecord;
import org.smeup.sys.il.esam.AccessMode;
import org.smeup.sys.il.esam.QSMDataSet;
import org.smeup.sys.os.file.QFileMember;
import org.smeup.sys.os.file.QFileMemberRow;

public class BaseFileMemberDataSetImpl<R extends QRecord> implements QSMDataSet<R> {

	private BaseFileMemberProvider fileMemberProvider;
	private R record;	
	
	private QFileMember fileMember;
	private QDataWriter dataWriter = QIntegratedLanguageDataFactory.eINSTANCE.createDataWriter();

	private boolean open = false;
	private int currentPosition = -1;
	
	public BaseFileMemberDataSetImpl(BaseFileMemberProvider fileMemberProvider, R record, AccessMode accessMode, boolean userOpen) {
		this.fileMemberProvider = fileMemberProvider;
		this.record = record;
	}

	@Override
	public boolean chain(QNumeric relativeRecordNumber) {
		return chain(relativeRecordNumber.asInteger());
	}

	@Override
	public boolean chain(int relativeRecordNumber) {		
		return chain(relativeRecordNumber, null);
	}

	@Override
	public boolean chain(QNumeric relativeRecordNumber, QIndicator notFound) {
		return chain(relativeRecordNumber.asInteger(), notFound);
	}

	@Override
	public boolean chain(int relativeRecordNumber, QIndicator notFound) {
		return chain(relativeRecordNumber, notFound, null);
	}

	@Override
	public boolean chain(int relativeRecordNumber, QIndicator notFound, Boolean lock) {
		return chain(relativeRecordNumber, notFound, lock, null);
	}

	@Override
	public boolean chain(int relativeRecordNumber, QIndicator notFound, Boolean lock, QIndicator error) {

		QFileMember fileMember = getFileMember();
		
		for(int i=1; i<=fileMember.getRows().size();i++) {
			if(i==relativeRecordNumber) {

				setRecord(fileMember.getRows().get(i-1));
				
				return true;
			}
		}

		return false;
	}

	@Override
	public void setgt(int relativeRecordNumber) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setgt(int relativeRecordNumber, QIndicator found) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setgt(int relativeRecordNumber, QIndicator found, QIndicator error) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setll(int relativeRecordNumber) {
		this.currentPosition = relativeRecordNumber;
	}

	@Override
	public <E extends Enum<E>> void setll(E keyField) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setll(QNumeric keyField) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setll(int relativeRecordNumber, QIndicator found) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setll(int relativeRecordNumber, QIndicator found, QIndicator equal) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setll(int relativeRecordNumber, QIndicator found, QIndicator equal, QIndicator error) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setgt(QNumeric relativeRecordNumber) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setgt(QNumeric relativeRecordNumber, QIndicator found) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setgt(QNumeric relativeRecordNumber, QIndicator found, QIndicator error) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <E extends Enum<E>> void setgt(E keyField) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close() {
		close(null);
	}

	@Override
	public void close(QIndicator error) {
		
		this.fileMember = null;
		
		this.open = false;
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(QIndicator error) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isEndOfData() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEqual() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isFound() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isOpen() {
		return this.open;
	}

	@Override
	public boolean onError() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void open() {
		open(null);
	}

	@Override
	public void open(QIndicator error) {
		this.open = true;
		getFileMember();		
	}

	@Override
	public boolean read() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean read(QIndicator endOfData) {

		if(getFileMember().getRows().size()<this.currentPosition) {
			if(endOfData != null)
				endOfData.eval(true);
			return false;
		}
		
		QFileMemberRow fileMemberRow = getFileMember().getRows().get(this.currentPosition-1);
		setRecord(fileMemberRow);
		
		this.currentPosition++;

		if(endOfData != null)
			endOfData.eval(false);
		
		return true;
	}

	@Override
	public boolean read(QIndicator endOfData, Boolean lock) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean read(QIndicator endOfData, Boolean lock, QIndicator error) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean readp() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean readp(QIndicator beginningOfData) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean readp(QIndicator beginningOfData, Boolean lock) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean readp(QIndicator beginningOfData, Boolean lock, QIndicator error) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void unlock() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unlock(QIndicator error) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(QIndicator error) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void write() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void write(QIndicator error) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public R get() {
		return this.record;
	}

	private QFileMember getFileMember() {
		
		if(this.fileMember == null) {
			this.fileMember = this.fileMemberProvider.getFileMember(); 
		}
		
		return this.fileMember;
	}
	
	private void setRecord(QFileMemberRow fileMemberRow) {

		
		switch (this.record.getElements().size()) {
		case 0:
			return;
		case 1:
			dataWriter.set(fileMemberRow.getSequence());
			record.getElement(1).eval(dataWriter);
			return;
		case 2:
			dataWriter.set(fileMemberRow.getSequence());
			record.getElement(1).eval(dataWriter);

			dataWriter.set(fileMemberRow.getDate());
			record.getElement(2).eval(dataWriter);

			return;
		case 3:
			dataWriter.set(fileMemberRow.getSequence());
			record.getElement(1).eval(dataWriter);

			dataWriter.set(fileMemberRow.getDate());
			record.getElement(2).eval(dataWriter);

			dataWriter.set(fileMemberRow.getContent());
			record.getElement(3).eval(dataWriter);
			return;
		}
	}
}