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
package org.smeup.sys.os.file.base.api;

import java.nio.ByteBuffer;
import java.util.ArrayList;

import javax.inject.Inject;

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
import org.smeup.sys.os.core.base.api.ErrorCodeRef;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobManager;
import org.smeup.sys.os.file.QFile;
import org.smeup.sys.os.file.QFileMember;
import org.smeup.sys.os.file.QFileMemberManager;
import org.smeup.sys.os.file.QFileMembered;
import org.smeup.sys.os.usrspc.QUserSpace;
import org.smeup.sys.os.usrspc.base.api.UserSpaceRef;

@Program(name = "QUSLMBR")
public class DatabaseFileMembersList {

	@Inject
	private QJob job;
	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QJobManager jobManager;
	@Inject
	private QFileMemberManager fileMemberManager;


	
	private USRSPC_HEADER_0100 userSpaceHeader;
	private MBRL0100 mbrl0100;
	private MBRL0200 mbrl0200;
	
	@Main 
	public void main(@DataDef(qualified = true) UserSpaceRef userSpaceRef, 
							@DataDef(length = 8) QEnum<FORMATEnum, QCharacter> formatName,
							@DataDef(qualified = true) FileRef fileRef,
							@DataDef(length = 10) QCharacter objectType,
							@DataDef(length = 1) QCharacter overrideProcessing,
							ErrorCodeRef errorCode) {
	
		QResourceWriter<QUserSpace> userSpaceWriter = resourceManager.getResourceWriter(job, QUserSpace.class, userSpaceRef.library.asEnum(), userSpaceRef.library.asData().trimR());
		QUserSpace userSpace = userSpaceWriter.lookup(userSpaceRef.name.trimR());
		if (userSpace == null) {
			errorCode.exceptionName.eval("002763");
			errorCode.bytesAvailable.eval(1);
			return;
		}
		userSpaceHeader.reset();
		
		userSpaceHeader.formatName.eval(formatName.asData());
		userSpaceHeader.apiUsed.eval("QUSLMBR");
		userSpaceHeader.dateTimeCreated.eval(Long.toString(jobManager.now(job).getTime()));
		userSpaceHeader.informationStatus.eval(ACCURATEEnum.PARTIAL);

		ArrayList<QFileMember> listObjects = getObjects(fileRef);
		userSpaceHeader.entriesNumber.eval(listObjects.size());
		userSpaceHeader.listSize.eval(userSpaceHeader.entriesNumber.qMult(mbrl0100.getSize()));

		switch(formatName.asEnum()){
		case MBRL0100:
			userSpaceHeader.listOffset.eval(512);
			userSpaceHeader.listSize.eval(userSpaceHeader.entriesNumber.qMult(mbrl0100.getSize()));
			userSpaceHeader.entrySize.eval(mbrl0100.getSize());
			break;
		case MBRL0200:
			userSpaceHeader.listOffset.eval(390);
			userSpaceHeader.listSize.eval(userSpaceHeader.entriesNumber.qMult(mbrl0200.getSize()));
			userSpaceHeader.entrySize.eval(mbrl0200.getSize());
			break;
		}
		byte[] bytes = new byte[userSpaceHeader.listOffset.i() + userSpaceHeader.listSize.i()];
		ByteBuffer buffer = ByteBuffer.wrap(bytes);
		
		buffer.put(userSpaceHeader.asBytes());
		
		buffer.position(userSpaceHeader.listOffset.i());
		
		for(QFileMember member: listObjects) {

			mbrl0100.clear();
			mbrl0200.clear();
			
			switch(formatName.asEnum()){
			case MBRL0100:
				setMbrl0100(member);
				buffer.put(mbrl0100.asBytes());
				break;
			case MBRL0200:
				setMbrl0100(member);
				mbrl0200.member100Format.eval(mbrl0100);
				mbrl0200.sourceType.eval(member.getType());;
				mbrl0200.memberTextDescription.eval(member.getText());
				buffer.put(mbrl0200.asBytes());
				break;
			}
		}
			
		userSpace.setContentArray(bytes);
		userSpaceWriter.save(userSpace, true);		
	}
	
	private void setMbrl0100(QFileMember member) {
		mbrl0100.memberNameUsed.eval(member.getName());
	}
	
	private ArrayList<QFileMember> getObjects(FileRef fileRef) {
		
		ArrayList<QFileMember> fileMembers = new ArrayList<QFileMember>();

		QResourceReader<QFile> fileReader = resourceManager.getResourceReader(job, QFile.class, fileRef.library.asEnum(), fileRef.library.asData().trimR()); 
		for(QFile file: fileReader.find(fileRef.name.trimR())) {
			if(!(file instanceof QFileMembered))
				continue;
			QFileMembered fileMembered = (QFileMembered)file;
			for(QFileMember fileMember: fileMemberManager.list(job, fileMembered))
				fileMembers.add(fileMember);
		}		
		
		return fileMembers;
	}


	public static class MBRL0100 extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter memberNameUsed;
	}

	public static class MBRL0200 extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter member100Format;
		@DataDef(length = 10)
		public QCharacter sourceType;
		@DataDef(length = 13)
		public QCharacter creationDate;
		@DataDef(length = 13)
		public QCharacter lastChange;
		@DataDef(length = 50)
		public QCharacter memberTextDescription;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary memberTextDescriptionCCSID;
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
		@DataDef(binaryType = BinaryType.INTEGER, value = "64")
		@Overlay(position = 113)
		public QBinary parameterSize;
		@DataDef(binaryType = BinaryType.INTEGER, value = "256")
		@Overlay(position = 117)
		public QBinary headerOffset;
		@DataDef(binaryType = BinaryType.INTEGER, value = "256")
		@Overlay(position = 121)
		public QBinary headerSize;
		@DataDef(binaryType = BinaryType.INTEGER, value = "512")
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
	
	public static class OBJECT extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QEnum<NameGenericEnum, QCharacter> nameGeneric;
		
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<LibraryEnum, QCharacter> library;

		public static enum NameGenericEnum {
			ALL, OTHER
		}

		public static enum LibraryEnum {
			LIBL, CURLIB, USRLIBL, ALLUSR, ALL, OTHER
		}
	}

	public static enum FORMATEnum {
		@Special(value = "MBRL0100") MBRL0100, @Special(value = "MBRL0200") MBRL0200;
	}
}