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
import java.util.List;

import javax.inject.Inject;

import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.QString;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Overlay;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.il.data.def.BinaryType;
import org.smeup.sys.il.data.term.QDataTerm;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.il.memo.Scope;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobManager;
import org.smeup.sys.os.file.QFile;
import org.smeup.sys.os.file.QFileFormat;
import org.smeup.sys.os.file.QFileFormatField;
import org.smeup.sys.os.file.QFileManager;
import org.smeup.sys.os.usrspc.QUserSpace;

@Program(name = "QUSLFLD")
public class FileFieldsLister {

	public static enum QCPFMSG {
	}

	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QJobManager jobManager;
	@Inject
	private QJob job;
	@Inject
	private QDataContext dataContext;
	@Inject
	private QFileManager fileManager;

	private USRSPC_HEADER_0100 userSpaceHeader;
	private USLFLD_FLDL0100 userSpaceField;
	
	public static class UserSpaceRef extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;

		@DataDef(length = 10)
		public QCharacter name;

		@DataDef(length = 10, value = "*LIBL")
		public QEnum<Scope, QCharacter> library;
	}

	public static enum FORMATEnum {
		FLDL0100, FLDL0200, FLDL0300;
	}

	public static enum ACCURATEEnum {
		@Special(value = "C") COMPLETE, @Special(value = "I") INCOMPLETE, @Special(value = "P") PARTIAL;
	}

	@Main
	public void main(@DataDef(qualified = true) UserSpaceRef userSpaceRef, 
					 @DataDef(length = 8) QEnum<FORMATEnum, QCharacter> formatName, 
					 @DataDef(qualified = true) FileRef fileRef,
					 @DataDef(length = 10) QCharacter recordFormatName, 
					 @DataDef(length = 1) QCharacter overrideProcessing, 
					 @DataDef(qualified = true) ERROR error) {

		QResourceWriter<QUserSpace> userSpaceWriter = resourceManager.getResourceWriter(job, QUserSpace.class, userSpaceRef.library.asEnum(), userSpaceRef.library.asData().trimR());
		QUserSpace userSpace = userSpaceWriter.lookup(userSpaceRef.name.trimR());
		if (userSpace == null) {
			error.exceptionID.eval("002763");
			return;
		}

		QResourceReader<QFile> fileReader = resourceManager.getResourceReader(job, QFile.class, fileRef.library.asEnum(), fileRef.library.asData().trimR());
		QFile file = fileReader.lookup(fileRef.name.trimR());
		if (file == null) {
			error.exceptionID.eval("002762");
			return;
		}

		// formatAPIHeader(file, recordFormatName, error);

		userSpaceHeader.reset();

		userSpaceHeader.formatName.eval(formatName.asData());
		userSpaceHeader.apiUsed.eval("QUSLFLD");
		userSpaceHeader.dateTimeCreated.eval(Long.toString(jobManager.now(job).getTime()));
		userSpaceHeader.informationStatus.eval(ACCURATEEnum.PARTIAL);
		userSpaceHeader.entrySize.eval(userSpaceField.getSize());

		QFileFormat<?> fileFormat = fileManager.getFileFormat(file, recordFormatName.trimR());
		userSpaceHeader.entriesNumber.eval(fileFormat.getDefinition().getElements().size());
		userSpaceHeader.listSize.eval(userSpaceHeader.entriesNumber.qMult(userSpaceField.getSize()));

		byte[] bytes = new byte[userSpaceHeader.listOffset.i() + userSpaceHeader.listSize.i()];
		ByteBuffer buffer = ByteBuffer.wrap(bytes);
		
		buffer.put(userSpaceHeader.asBytes());
		
		buffer.position(userSpaceHeader.listOffset.i());
		for(QDataTerm<?> dataTermField: fileFormat.getDefinition().getElements()) {
			QFileFormatField fileFormatField = (QFileFormatField)dataTermField;
			
			userSpaceField.clear();
			userSpaceField.fieldName.eval(fileFormatField.getName());
			userSpaceField.fieldLength.eval(fileFormatField.getDefinition().getLength());
			userSpaceField.fieldText.eval(fileFormatField.getText());
			
			buffer.put(userSpaceField.asBytes());
		}
			
		userSpace.setContentArray(bytes);

		userSpaceWriter.save(userSpace, true);

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

	public static class USLFLD_HEADER extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter fileName;
		@DataDef(length = 10)
		public QCharacter fileLibraryName;
		@DataDef(length = 10)
		public QCharacter fileType;
		@DataDef(length = 10)
		public QCharacter recordFormatName;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary recordLength;
		@DataDef(length = 13)
		public QCharacter recordFormatID;
		@DataDef(length = 50)
		public QCharacter recordText;
		@DataDef(length = 1)
		public QCharacter reserved01;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary textDescriptionCCSID;
		@DataDef(length = 1)
		public QCharacter variableLengthFields;
		@DataDef(length = 1)
		public QCharacter graphicFields;
		@DataDef(length = 1)
		public QCharacter dateTimeFields;
		@DataDef(length = 1)
		public QCharacter nullCapableFields;
	}

	public static class USLFLD_FLDL0100 extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter fieldName;
		@DataDef(length = 1)
		public QCharacter dataType;
		@DataDef(length = 1)
		public QCharacter use;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary outputBufferPosition;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary inputBufferPosition;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary fieldLength;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary digits;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary decimal;
		@DataDef(length = 50)
		public QCharacter fieldText;
		@DataDef(length = 2)
		public QCharacter editCode;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary editWordLength;
		@DataDef(length = 64)
		public QCharacter editWord;
		@DataDef(length = 20)
		public QCharacter columnHeading1;
		@DataDef(length = 20)
		public QCharacter columnHeading2;
		@DataDef(length = 20)
		public QCharacter columnHeading3;
		@DataDef(length = 10)
		public QCharacter fieldNameInternal;
		@DataDef(length = 30)
		public QCharacter fieldNameAlternative;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary fieldNameAlternativeLength;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary characterDBCSnumber;
		@DataDef(length = 1)
		public QCharacter nullValueAllowed;
		@DataDef(length = 1)
		public QCharacter hostVariableIndictor;
		@DataDef(length = 4)
		public QCharacter dataTimeFormat;
		@DataDef(length = 1)
		public QCharacter dateTimeSeparator;
		@DataDef(length = 1)
		public QCharacter variableLengthFieldIndicator;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary textDescriptionCCSID;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary dataCCSID;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary columnHeadingCCSID;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary fieldEditWor;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary fieldDisplayedLength;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary fieldDataEncodingScheme;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary fieldMaximumObjectLength;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary padLength;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary userDefinedTypeLength;
		@DataDef(length = 128)
		public QCharacter userDefinedTypeName;
		@DataDef(length = 10)
		public QCharacter userDefinedTypeLibraryName;
		@DataDef(length = 1)
		public QCharacter dataLinkControl;
		@DataDef(length = 1)
		public QCharacter dataLinkIntegrity;
		@DataDef(length = 1)
		public QCharacter dataLinkReadPermission;
		@DataDef(length = 1)
		public QCharacter dataLinkWritePermission;
		@DataDef(length = 1)
		public QCharacter dataLinkRecovery;
		@DataDef(length = 1)
		public QCharacter dataLinkUnlinkControl;
		@DataDef(length = 11)
		@Overlay(position = 534)
		public QCharacter reserved01;
	}

	public static class ERROR extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;

		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary bytesProvided;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary bytesAvailable;
		@DataDef(length = 7)
		public QCharacter exceptionID;
		@DataDef(length = 1)
		public QCharacter reserved01;
	}

	@SuppressWarnings("unused")
	private USLFLD_HEADER formatAPIHeader(QFile file, QString recordFormatName, ERROR error) {

		USLFLD_HEADER uslFieldHeader = dataContext.getDataFactory().createDataStruct(USLFLD_HEADER.class, 0, true);
		uslFieldHeader.fileName.eval(file.getName());
		uslFieldHeader.fileLibraryName.eval(file.getLibrary());
		uslFieldHeader.fileType.eval(file.getAttribute());

		QFileFormat<?> fileFormat = fileManager.getFileFormat(file, recordFormatName.trimR());
		uslFieldHeader.recordFormatName.eval(fileFormat.getName());
		uslFieldHeader.recordLength.eval(calculateLength(fileFormat));

		if (fileFormat.getText() != null)
			uslFieldHeader.recordText.eval(fileFormat.getText());

		return uslFieldHeader;
	}

	private int calculateLength(QFileFormat<?> fileFormat) {

		int length = 0;
		List<?> elements = fileFormat.getDefinition().getElements();
		for (Object element : elements) {
			if (element instanceof QFileFormatField)
				length += ((QFileFormatField) element).getDefinition().getSize();
		}

		return length;
	}

}