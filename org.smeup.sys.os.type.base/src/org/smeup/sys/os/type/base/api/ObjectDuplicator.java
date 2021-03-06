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

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.smeup.sys.db.core.QConnection;
import org.smeup.sys.dk.core.annotation.Supported;
import org.smeup.sys.il.core.QObjectIterator;
import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.QScroller;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.il.memo.Scope;
import org.smeup.sys.os.core.QExceptionManager;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobLogManager;
import org.smeup.sys.os.file.QPhysicalFile;
import org.smeup.sys.os.type.QType;
import org.smeup.sys.os.type.QTypeRegistry;
import org.smeup.sys.os.type.QTypedObject;

@Program(name = "QLICRDUP")
public @Supported class ObjectDuplicator {
	public static enum QCPFMSG {
		CPF2130, CPF2110, CPF2105
	}

	@Inject
	private QTypeRegistry typeRegistry;
	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QJob job;
	@Inject
	private QJobLogManager jobLogManager;
	@Inject
	private QExceptionManager exceptionManager;

	@Main
	public void main(@Supported @DataDef(length = 10) QEnum<FROMOBJECTEnum, QCharacter> fromObject, @Supported @DataDef(length = 10) QEnum<FROMLIBRARYEnum, QCharacter> fromLibrary,
			@Supported @DataDef(dimension = 57, length = 7) QScroller<QCharacter> objectTypes, @Supported @DataDef(length = 10) QEnum<TOLIBRARYEnum, QCharacter> toLibrary,
			@Supported @DataDef(length = 10) QEnum<NEWOBJECTEnum, QCharacter> newObjectName, @DataDef(length = 10) QEnum<FROMASPDEVICEEnum, QCharacter> fromASPDevice,
			@DataDef(length = 10) QEnum<TOASPDEVICEEnum, QCharacter> toASPDevice, @Supported @DataDef(length = 1) QEnum<DUPLICATEDATAEnum, QCharacter> duplicateData,
			@DataDef(length = 1) QEnum<DUPLICATECONSTRAINTSEnum, QCharacter> duplicateConstraints, @DataDef(length = 1) QEnum<DUPLICATETRIGGERSEnum, QCharacter> duplicateTriggers,
			@DataDef(length = 1) QEnum<DUPLICATEFILEIDENTIFIERSEnum, QCharacter> duplicateFileIdentifiers) {

		if (fromLibrary.asEnum().equals(FROMLIBRARYEnum.OTHER)) {
			checkLibrary(fromLibrary.asData().trimR());
		}

		if (toLibrary.asEnum().equals(TOLIBRARYEnum.OTHER)) {
			checkLibrary(toLibrary.asData().trimR());
		}

		List<QType<?>> types = typesFrom(objectTypes);

		int duplicated = 0;
		for (QType<?> type : types) {

			if (!type.isPersistent())
				continue;

			QResourceReader<?> resourceReader = null;
			switch (fromLibrary.asEnum()) {
			case CURLIB:
				resourceReader = resourceManager.getResourceReader(job, type.getTypedClass(), Scope.CURRENT_LIBRARY);
				break;
			case LIBL:
				resourceReader = resourceManager.getResourceReader(job, type.getTypedClass(), Scope.LIBRARY_LIST);
				break;
			case OTHER:
				resourceReader = resourceManager.getResourceReader(job, type.getTypedClass(), fromLibrary.asData().trimR());
				break;
			}

			QObjectIterator<? extends QObjectNameable> objectIterator = null;
			try {
				switch (fromObject.asEnum()) {
				case ALL:
					objectIterator = resourceReader.find(null);
					break;

				case OTHER:
					objectIterator = resourceReader.find(fromObject.asData().trimR());
					break;
				}

				while (objectIterator.hasNext()) {
					duplicate(toLibrary, newObjectName, type, (QTypedObject) objectIterator.next(), duplicateData.asEnum());
					duplicated++;
				}
			} finally {
				if (objectIterator != null) {
					objectIterator.close();
				}
			}
		}
		if (duplicated == 0) {
			throw exceptionManager.prepareException(job, QCPFMSG.CPF2105, new String[] {fromObject.asData().trimR(), fromLibrary.asData().trimR(), describe(types) });
		}
	}

	private String describe(List<QType<?>> types) {
		StringBuffer result = new StringBuffer();
		for (QType<?> qType : types) {
			result.append(qType.getName()).append(" ");
		}
		return result.toString();
	}

	private void checkLibrary(String libName) {
		QType<?> libType = typeRegistry.lookup("*LIB");
		QResourceReader<?> resourceReader = resourceManager.getResourceReader(job, libType.getTypedClass(), Scope.ALL);
		if (!resourceReader.exists(libName))
			throw exceptionManager.prepareException(job, QCPFMSG.CPF2110, new String[] { libName });
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void duplicate(QEnum<TOLIBRARYEnum, QCharacter> toLibrary, QEnum<NEWOBJECTEnum, QCharacter> newObjectName, QType<?> type, QTypedObject objToDuplicate, DUPLICATEDATAEnum duplicateData) {
		QResourceWriter resourceWriter = getWriter(toLibrary, type, objToDuplicate.getLibrary());

		QTypedObject duplicatedObject = (QTypedObject) EcoreUtil.copy((EObject) objToDuplicate);

		switch (newObjectName.asEnum()) {
		case SAME:
		case OBJ:
			// Nulla
			break;

		case OTHER:
			duplicatedObject.setName(newObjectName.asData().trimR());
			break;
		}

		resourceWriter.save(duplicatedObject);
		if ((objToDuplicate instanceof QPhysicalFile) && DUPLICATEDATAEnum.YES.equals(duplicateData)) {
			new ObjectDataDuplicator(job.getContext().getAdapter(job, QConnection.class)).duplicateData(objToDuplicate, duplicatedObject);
		}
		jobLogManager.info(job, "Object " + duplicatedObject.getName() + " created in library " + duplicatedObject.getLibrary() + " of type " + type.getName());
	}

	private QResourceWriter<? extends QTypedObject> getWriter(QEnum<TOLIBRARYEnum, QCharacter> toLibrary, QType<?> type, String sourceLibraryName) {
		QResourceWriter<? extends QTypedObject> resourceWriter = null;

		switch (toLibrary.asEnum()) {
		case CURLIB:
			resourceWriter = resourceManager.getResourceWriter(job, type.getTypedClass(), Scope.CURRENT_LIBRARY);
			break;

		case SAME:
		case FROMLIB:
			resourceWriter = resourceManager.getResourceWriter(job, type.getTypedClass(), sourceLibraryName);
			break;

		case OTHER:
			resourceWriter = resourceManager.getResourceWriter(job, type.getTypedClass(), toLibrary.asData().trimR());
			break;
		}

		return resourceWriter;
	}

	private List<QType<?>> typesFrom(QScroller<QCharacter> objectTypes) {
		List<QType<?>> result = new ArrayList<QType<?>>();

		for (QCharacter type : objectTypes) {
			String objectTypeString = type.toString().trim();
			if (objectTypeString != null && !"".equals(objectTypeString)) {
				if (objectTypeString.equals("*ALL")) {
					result.addAll(typeRegistry.list());
					break;
				} else {
					QType<?> typeFound = typeRegistry.lookup(objectTypeString);
					if (typeFound != null) {
						result.add(typeFound);
					}
				}
			}
		}

		return result;
	}

	public static enum FROMOBJECTEnum {
		ALL, OTHER
	}

	public static enum FROMLIBRARYEnum {
		LIBL, CURLIB, OTHER
	}

	public static enum TOLIBRARYEnum {
		@Special(value = "*SAME")
		FROMLIB, SAME, CURLIB, OTHER
	}

	public static enum NEWOBJECTEnum {
		@Special(value = "*SAME")
		OBJ, SAME, OTHER
	}

	public static enum FROMASPDEVICEEnum {
		@Special(value = "*")
		TERM_STAR, CURASPGRP, SYSBAS, OTHER
	}

	public static enum TOASPDEVICEEnum {
		ASPDEV, @Special(value = "*")
		TERM_STAR, CURASPGRP, SYSBAS, OTHER
	}

	public static enum DUPLICATEDATAEnum {
		@Special(value = "N")
		NO, @Special(value = "Y")
		YES
	}

	public static enum DUPLICATECONSTRAINTSEnum {
		@Special(value = "Y")
		YES, @Special(value = "N")
		NO
	}

	public static enum DUPLICATETRIGGERSEnum {
		@Special(value = "Y")
		YES, @Special(value = "N")
		NO
	}

	public static enum DUPLICATEFILEIDENTIFIERSEnum {
		@Special(value = "N")
		NO, @Special(value = "Y")
		YES
	}
}
