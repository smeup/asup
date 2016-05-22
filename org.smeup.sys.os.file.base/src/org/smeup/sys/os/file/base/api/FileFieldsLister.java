/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Franco Lombardo - Initial API and implementation
 */
package org.smeup.sys.os.file.base.api;

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
import org.smeup.sys.il.data.def.BinaryType;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.il.memo.Scope;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.file.QDatabaseFile;
import org.smeup.sys.os.file.QDisplayFile;
import org.smeup.sys.os.file.QFile;
import org.smeup.sys.os.file.QFileFormat;
import org.smeup.sys.os.file.QFileFormatField;
import org.smeup.sys.os.file.QPrinterFile;
import org.smeup.sys.os.usrspc.QUserSpace;

@Program(name = "QUSLFLD")
public class FileFieldsLister {

	public static enum QCPFMSG {
	}

	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QJob job;
	@Inject
	private QDataContext dataContext;

	@Main
	public void main(@DataDef(qualified = true) UserSpaceRef userSpaceRef, @DataDef(length = 8) QEnum<FORMATEnum, QCharacter> formatName, @DataDef(qualified = true) FileRef fileRef,
			@DataDef(length = 10) QCharacter recordFormatName, @DataDef(length = 1) QCharacter overrideProcessing, @DataDef(qualified = true) ERROR error) {

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

		HEADER_USRSPC_0100 headerUsrspc_0100 = dataContext.getDataFactory().createDataStruct(HEADER_USRSPC_0100.class, 0, true);
		headerUsrspc_0100.headerSize.eval(128);
		headerUsrspc_0100.structureReleaseLevel.eval("0100");
		headerUsrspc_0100.formatName.eval(formatName.asData());
		headerUsrspc_0100.apiUsed.eval("QUSLFLD");
		headerUsrspc_0100.dateTimeCreated.eval("1160522202951");
		headerUsrspc_0100.informationStatus.eval("C");

		userSpace.setContentArray(headerUsrspc_0100.asBytes());
		userSpaceWriter.save(userSpace, true);
	}

	@SuppressWarnings("unused")
	private HEADER_USLFLD formatAPIHeader(QFile file, QString recordFormatName, ERROR error) {

		HEADER_USLFLD headerUslFld = dataContext.getDataFactory().createDataStruct(HEADER_USLFLD.class, 0, true);
		headerUslFld.fileName.eval(file.getName());
		headerUslFld.fileLibraryName.eval(file.getLibrary());
		headerUslFld.fileType.eval(file.getAttribute());

		QFileFormat<?> fileFormat = null;
		if (file instanceof QDatabaseFile) {
			QDatabaseFile databaseFile = (QDatabaseFile) file;
			fileFormat = databaseFile.getDatabaseFormat();
		} else if (file instanceof QDisplayFile) {
			QDisplayFile displayFile = (QDisplayFile) file;
			for (QFileFormat<?> displayFormat : displayFile.getDisplayFormats()) {
				if (!displayFormat.getName().equalsIgnoreCase(recordFormatName.trimR()))
					continue;

				fileFormat = displayFormat;
				break;
			}
		} else if (file instanceof QPrinterFile) {
			QPrinterFile printerFile = (QPrinterFile) file;
			for (QFileFormat<?> printerFormat : printerFile.getPrinterFormats()) {
				if (!printerFormat.getName().equalsIgnoreCase(recordFormatName.trimR()))
					continue;

				fileFormat = printerFormat;
				break;
			}

		} else {
			error.exceptionID.eval("002761");
			return null;
		}
		headerUslFld.recordFormatName.eval(fileFormat.getName());
		headerUslFld.recordLength.eval(calculateLength(fileFormat));

		if (fileFormat.getText() != null)
			headerUslFld.recordText.eval(fileFormat.getText());

		return headerUslFld;
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

	public static class HEADER_USRSPC_0100 extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 64)
		@Overlay(position = 1)
		public QCharacter userArea;
		@DataDef(binaryType = BinaryType.INTEGER)
		@Overlay(position = 65)
		public QBinary headerSize;
		@DataDef(length = 4)
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
		public QCharacter informationStatus;
		@DataDef(binaryType = BinaryType.INTEGER)
		@Overlay(position = 105)
		public QBinary dmo£ge;
		@DataDef(binaryType = BinaryType.INTEGER)
		@Overlay(position = 109)
		public QBinary sci£ge;
		@DataDef(binaryType = BinaryType.INTEGER)
		@Overlay(position = 113)
		public QBinary dmi£ge;
		@DataDef(binaryType = BinaryType.INTEGER)
		@Overlay(position = 117)
		public QBinary sct£ge;
		@DataDef(binaryType = BinaryType.INTEGER)
		@Overlay(position = 121)
		public QBinary dmt£ge;
		@DataDef(binaryType = BinaryType.INTEGER)
		@Overlay(position = 125)
		public QBinary scl£ge;
		@DataDef(binaryType = BinaryType.INTEGER)
		@Overlay(position = 129)
		public QBinary dml£ge;
		@DataDef(binaryType = BinaryType.INTEGER)
		@Overlay(position = 133)
		public QBinary nrv£ge;
		@DataDef(binaryType = BinaryType.INTEGER)
		@Overlay(position = 137)
		public QBinary dmv£ge;
	}

	public static class HEADER_USLFLD extends QDataStructWrapper {
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

	public static class FLDL0100 extends QDataStructWrapper {
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
}