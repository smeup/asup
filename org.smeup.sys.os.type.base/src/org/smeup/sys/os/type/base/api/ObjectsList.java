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
package org.smeup.sys.os.type.base.api;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.smeup.sys.il.core.QObject;
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
import org.smeup.sys.il.memo.Scope;
import org.smeup.sys.os.cmd.base.api.ErrorCodeRef;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobLogManager;
import org.smeup.sys.os.core.jobs.QJobManager;
import org.smeup.sys.os.type.QType;
import org.smeup.sys.os.type.QTypeRegistry;
import org.smeup.sys.os.type.QTypedObject;
import org.smeup.sys.os.type.base.api.ObjectsList.OBJECT.NameGenericEnum;
import org.smeup.sys.os.usrspc.QUserSpace;
import org.smeup.sys.os.usrspc.base.api.UserSpaceRef;

@Program(name = "QUSLOBJ")
public class ObjectsList {

	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QJobManager jobManager;
	@Inject
	private QJob job;
	@Inject
	private QTypeRegistry typeRegistry;
	@Inject
	private QJobLogManager jobLogManager;
	
	private USRSPC_HEADER_0100 userSpaceHeader;
	private OBJL0100 objl0100;
	private OBJL0200 objl0200;
	
	@Main
	public void main(@DataDef(qualified = true) UserSpaceRef userSpaceRef, 
			@DataDef(length = 8) QEnum<FORMATEnum, QCharacter> formatName, 
			@DataDef(qualified = true) OBJECT objectName, 
			@DataDef(length = 10) QCharacter objectType,
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
		userSpaceHeader.apiUsed.eval("QUSLOBJ");
		userSpaceHeader.dateTimeCreated.eval(Long.toString(jobManager.now(job).getTime()));
		userSpaceHeader.informationStatus.eval(ACCURATEEnum.PARTIAL);

		ArrayList<QObject> listObjects = getObjects(objectName, objectType);
		userSpaceHeader.entriesNumber.eval(listObjects.size());
		userSpaceHeader.listSize.eval(userSpaceHeader.entriesNumber.qMult(objl0100.getSize()));

		switch(formatName.asEnum()){
		case OBJL0100:
			userSpaceHeader.listOffset.eval(512);
			userSpaceHeader.listSize.eval(userSpaceHeader.entriesNumber.qMult(objl0100.getSize()));
			userSpaceHeader.entrySize.eval(objl0100.getSize());
			break;
		case OBJL0200:
			userSpaceHeader.listOffset.eval(390);
			userSpaceHeader.listSize.eval(userSpaceHeader.entriesNumber.qMult(objl0200.getSize()));
			userSpaceHeader.entrySize.eval(objl0200.getSize());
			break;
		}
		byte[] bytes = new byte[userSpaceHeader.listOffset.i() + userSpaceHeader.listSize.i()];
		ByteBuffer buffer = ByteBuffer.wrap(bytes);
		
		buffer.put(userSpaceHeader.asBytes());
		
		buffer.position(userSpaceHeader.listOffset.i());
		for(QObject objectChild: listObjects) {

			objl0100.clear();
			objl0200.clear();
			
			switch(formatName.asEnum()){
			case OBJL0100:
				setObjl0100(objectChild, objectType);
				buffer.put(objl0100.asBytes());
				break;
			case OBJL0200:
				setObjl0100(objectChild, objectType);
				objl0200.objectl0100Format.eval(objl0100);
				// TODO
				buffer.put(objl0200.asBytes());
				break;
			}

		}
			
		userSpace.setContentArray(bytes);
		userSpaceWriter.save(userSpace, true);		
	}

	private void setObjl0100(QObject objectChild, QCharacter objectType) {

		QTypedObject qTypedObject = (QTypedObject) objectChild;
		
		objl0100.objectNameUsed.eval(qTypedObject.getName());
		objl0100.objectLibraryUsed.eval(qTypedObject.getLibrary());
		objl0100.objectTypeUsed.eval(objectType);
	}
	
	private ArrayList<QObject> getObjects(OBJECT objectName, QCharacter objectType) {
		ArrayList<QObject> objects = new ArrayList<QObject>();

		List<QType<?>> types = findTypes(objectType);
		for (QType<?> type : types) {
			QResourceReader<?> resourceReader = findReader(objectName, type);
			if (type.getName().equals("*TYPE"))
				continue;
			try (QObjectIterator<?> objectIterator = findIterator(objectName.nameGeneric , resourceReader);) {
				while (objectIterator.hasNext()) {
					QObject qObject = null;
					try {
						qObject = objectIterator.next();

						if (qObject instanceof QTypedObject) {
							QTypedObject qTypedObject = (QTypedObject) qObject;
							objects.add(qTypedObject);
						}
					} catch (Exception e) {
						jobLogManager.error(job, qObject + " " + e.getMessage());
					}
				}
			}
		}
		return objects;
	}


	private List<QType<?>> findTypes(QCharacter objectType) {
		List<QType<?>> types = new ArrayList<QType<?>>();
		if (objectType.trimR().equals("*ALL"))
			types.addAll(typeRegistry.list());
		else
			types.add(typeRegistry.lookup(objectType.trimR()));
		return types;
	}
	
	private QResourceReader<?> findReader(OBJECT object, QType<?> type) {
		QResourceReader<?> resourceReader = null;
		switch (object.library.asEnum()) {
		case ALL:
			resourceReader = resourceManager.getResourceReader(job, type.getTypedClass(), Scope.ALL);
			break;
		case ALLUSR:
			resourceReader = resourceManager.getResourceReader(job, type.getTypedClass(), Scope.ALL_USER);
			break;
		case CURLIB:
			resourceReader = resourceManager.getResourceReader(job, type.getTypedClass(), Scope.CURRENT_LIBRARY);
			break;
		case LIBL:
			resourceReader = resourceManager.getResourceReader(job, type.getTypedClass(), Scope.LIBRARY_LIST);
			break;
		case USRLIBL:
			resourceReader = resourceManager.getResourceReader(job, type.getTypedClass(), Scope.USER_LIBRARY_LIST);
			break;
		case OTHER:
			resourceReader = resourceManager.getResourceReader(job, type.getTypedClass(), object.library.asData().trimR());
			break;
		}
		return resourceReader;
	}
	
	@SuppressWarnings("resource")
	private QObjectIterator<?> findIterator(QEnum<NameGenericEnum, QCharacter> nameGeneric, QResourceReader<?> resourceReader) {
		QObjectIterator<?> result = null;
		switch (nameGeneric.asEnum()) {
		case ALL:
			result = resourceReader.find(null);
			break;
		case OTHER:
			result = resourceReader.find(nameGeneric.asData().trimR());
			break;
		}
		return result;
	}

	public static enum FORMATEnum {
		@Special(value = "OBJL0100") OBJL0100, @Special(value = "OBJL0200") OBJL0200;
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

	public static enum ACCURATEEnum {
		@Special(value = "C") COMPLETE, @Special(value = "I") INCOMPLETE, @Special(value = "P") PARTIAL;
	}
	
	public static class OBJL0100 extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter objectNameUsed;
		@DataDef(length = 10)
		public QCharacter objectLibraryUsed;
		@DataDef(length = 6)
		public QCharacter objectTypeUsed;
	}

	public static class OBJL0200 extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 30)
		public QCharacter objectl0100Format;
		@DataDef(length = 1)
		public QCharacter objectInformationStatus;
		@DataDef(length = 10)
		public QCharacter extendedObjectAttribute;
		@DataDef(length = 50)
		public QCharacter textDescription;
		@DataDef(length = 10)
		public QCharacter userDefinedAttribute;
		@DataDef(length = 7)
		public QCharacter reserved;
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
}