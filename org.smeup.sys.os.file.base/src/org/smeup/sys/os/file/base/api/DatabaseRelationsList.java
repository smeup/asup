/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Giuliano Giancristofaro - Initial API and implementation
 */
package org.smeup.sys.os.file.base.api;

import java.nio.ByteBuffer;
import java.util.List;

import javax.inject.Inject;

import org.eclipse.datatools.modelbase.sql.constraints.Index;
import org.eclipse.datatools.modelbase.sql.tables.Table;
import org.smeup.sys.db.core.QConnection;
import org.smeup.sys.il.core.QObjectIterator;
import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Overlay;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.il.data.def.BinaryType;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.os.cmd.base.api.ErrorCodeRef;
import org.smeup.sys.os.core.QExceptionManager;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobLogManager;
import org.smeup.sys.os.core.jobs.QJobManager;
import org.smeup.sys.os.file.QFile;
import org.smeup.sys.os.usrspc.QUserSpace;
import org.smeup.sys.os.usrspc.base.api.UserSpaceRef;

@Program(name = "QDBLDBR")
public class DatabaseRelationsList {

	@Inject
	private QJob job;
	@Inject
	private QJobManager jobManager;
	@Inject
	private QJobLogManager jobLogManager;	
	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QExceptionManager exceptionManager;
	
	private USRSPC_HEADER_0100 userSpaceHeader;
	private DBRL0100 dbrl0100;
	
	@Main
	public void main(UserSpaceRef userSpaceRef, 
			@DataDef(length = 8) QEnum<FORMATEnum, QCharacter> formatName, 
			FileRef qualifiedFileName, 
			@DataDef(length = 10) QCharacter member,
			@DataDef(length = 10) QCharacter recordFormat, 
			ErrorCodeRef errorCode) {

		errorCode.clear();

		QResourceReader<QFile> fileReader = resourceManager.getResourceReader(job, QFile.class, qualifiedFileName.library.asEnum(), qualifiedFileName.library.asData().trimR());

		QObjectIterator<QFile> files = fileReader.find(qualifiedFileName.name.trimR());
		if(!files.hasNext()) {
			files.close();
			throw exceptionManager.prepareException(job, QCPFMSG.CPF2105, new String[] {qualifiedFileName.name.trimR(), qualifiedFileName.library.asData().trimR(), "FILE"});	
		}
		
		QFile file = files.next();
		files.close();
		
		QConnection connection = job.getContext().getAdapter(job, QConnection.class);
		Table table = connection.getCatalogMetaData().getTable(file.getLibrary(), file.getName());
		if(table==null){
			jobLogManager.error(job, "File name not valid " + qualifiedFileName);
			errorCode.bytesAvailable.eval(1);
			return;
		}

		QResourceWriter<QUserSpace> userSpaceWriter = resourceManager.getResourceWriter(job, QUserSpace.class, userSpaceRef.library.asEnum(), userSpaceRef.library.asData().trimR());
		QUserSpace userSpace = userSpaceWriter.lookup(userSpaceRef.name.trimR());
		if (userSpace == null) {
			errorCode.bytesAvailable.eval(1);
			errorCode.exceptionName.eval("002763");
			jobLogManager.error(job, "Userspace name not found " + userSpaceRef);
			return;
		}

		userSpaceHeader.reset();

		userSpaceHeader.formatName.eval(formatName.asData());
		userSpaceHeader.apiUsed.eval("QDBLDBR");
		userSpaceHeader.dateTimeCreated.eval(Long.toString(jobManager.now(job).getTime()));
		userSpaceHeader.informationStatus.eval(ACCURATEEnum.PARTIAL);
		userSpaceHeader.entriesNumber.eval(table.getIndex().size());
		userSpaceHeader.listSize.eval(userSpaceHeader.entriesNumber.qMult(dbrl0100.getSize()));
		userSpaceHeader.entrySize.eval(dbrl0100.getSize());

		byte[] bytes = null;
		ByteBuffer buffer = null;
		
		switch(formatName.asEnum()){
		case DBRL0100:

			dbrl0100.clear();
			userSpaceHeader.listOffset.eval(260);
			bytes = new byte[userSpaceHeader.listOffset.i() + userSpaceHeader.listSize.i()];
			buffer = ByteBuffer.wrap(bytes);
			buffer.put(userSpaceHeader.asBytes());
			buffer.position(userSpaceHeader.listOffset.i());
			@SuppressWarnings("unchecked") 
			List<Index> indexes = table.getIndex();
			for (Index index : indexes) {
				dbrl0100.fileNameUsed.eval(file.getName());
				dbrl0100.fileLibraryNameUsed.eval(file.getLibrary());
				dbrl0100.dependentFileName.eval(index.getName());
				dbrl0100.dependentLibraryName.eval(file.getLibrary());
				dbrl0100.dependencyType.eval("D");
				buffer.put(dbrl0100.asBytes());
			}
			break;
		case DBRL0200:
		case DBRL0300:
			
			jobLogManager.error(job, "***TODO*** API - QDBLDBR - DatabaseRelationsList - format not implemented: " + formatName.asData().qTrimr());
			errorCode.bytesAvailable.eval(1);
			return;
		}

		userSpace.setContentArray(bytes);
//		userSpace.setContent(new String( bytes, dataContext.getCharset()));
		userSpaceWriter.save(userSpace, true);
	}

	public static enum FORMATEnum {
		@Special(value = "DBRL0100") DBRL0100, 
		@Special(value = "DBRL0200") DBRL0200, 
		@Special(value = "DBRL0300") DBRL0300;
	}
	
	public static class DBRL0100 extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter fileNameUsed;
		@DataDef(length = 10)
		public QCharacter fileLibraryNameUsed;
		@DataDef(length = 10)
		public QCharacter dependentFileName;
		@DataDef(length = 10)
		public QCharacter dependentLibraryName;
		@DataDef(length = 1)
		public QCharacter dependencyType;
		@DataDef(length = 3)
		public QCharacter reserved;
		@DataDef(binaryType = BinaryType.INTEGER) 
		public QBinary joinReferenceNumber;
		@DataDef(length = 10)
		public QCharacter constraintLibraryName;
		@DataDef(binaryType = BinaryType.INTEGER) 
		public QBinary constraintNameLength;
		@DataDef(length = 258)
		public QCharacter constraintName;
	}
	
	public static class USRSPC_HEADER_0100 extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 64)
		@Overlay(position = 1)
		public QCharacter userArea;
		@DataDef(binaryType = BinaryType.INTEGER, value = "128")
		@Overlay(position = 65)
		public QBinary userSpaceHeaderSize;
		@DataDef(length = 4, value = "0100")
		@Overlay(position = 69)
		public QCharacter structureReleaseLevel;
		@DataDef(length = 8)
		@Overlay(position = 73)
		public QCharacter formatName;
		@DataDef(length = 10)
		@Overlay(position = 81)
		public QCharacter apiUsed;
		@DataDef(length = 13)
		@Overlay(position = 91)
		public QCharacter dateTimeCreated;
		@DataDef(length = 1)
		@Overlay(position = 104)
		public QEnum<ACCURATEEnum, QCharacter> informationStatus;
		@DataDef(binaryType = BinaryType.INTEGER)
		@Overlay(position = 105)
		public QBinary userSpaceSizeUsed;
		@DataDef(binaryType = BinaryType.INTEGER, value = "192")
		@Overlay(position = 109)
		public QBinary parameterOffset;
		@DataDef(binaryType = BinaryType.INTEGER, value = "68")
		@Overlay(position = 113)
		public QBinary parameterSize;
		@DataDef(binaryType = BinaryType.INTEGER)
		@Overlay(position = 117)
		public QBinary headerOffset;
		@DataDef(binaryType = BinaryType.INTEGER)
		@Overlay(position = 121)
		public QBinary headerSize;
		@DataDef(binaryType = BinaryType.INTEGER)
		@Overlay(position = 125)
		public QBinary listOffset;
		@DataDef(binaryType = BinaryType.INTEGER)
		@Overlay(position = 129)
		public QBinary listSize;
		@DataDef(binaryType = BinaryType.INTEGER)
		@Overlay(position = 133)
		public QBinary entriesNumber;
		@DataDef(binaryType = BinaryType.INTEGER)
		@Overlay(position = 137)
		public QBinary entrySize;

		@DataDef(binaryType = BinaryType.INTEGER)
		@Overlay(position = 141)
		public QBinary entryCCSID;
		@DataDef(length = 2)
		@Overlay(position = 145)
		public QCharacter countryID;
		@DataDef(length = 3)
		@Overlay(position = 147)
		public QCharacter languageID;
		@DataDef(length = 1)
		@Overlay(position = 150)
		public QCharacter listIndicator;
		@DataDef(length = 42)
		@Overlay(position = 151)
		public QCharacter reserved01;
	}	

	public static enum ACCURATEEnum {
		@Special(value = "C") COMPLETE, @Special(value = "I") INCOMPLETE, @Special(value = "P") PARTIAL;
	}

	public static enum QCPFMSG {
		CPF2105
	}

}