/**
 *  Copyright (c) 2012, 2015 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Franco Lombardo - Initial API and implementation
 */
package org.smeup.sys.os.type.base.api;

import javax.inject.Inject;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.smeup.sys.db.core.QConnection;
import org.smeup.sys.dk.core.annotation.Supported;
import org.smeup.sys.dk.core.annotation.ToDo;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QEnum;
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
import org.smeup.sys.os.type.base.api.tools.IndexList;
import org.smeup.sys.os.type.base.api.tools.ObjectNameAndLib;
import org.smeup.sys.os.type.base.api.tools.TypeChecker;

@Supported
@Program(name = "QLIMVOBJ")
public @ToDo class ObjectMover {
	public static enum QCPFMSG {
		CPF2105, // Non trovato oggetto &1 in &2 tipo *&3.
		CPF2110, // Libreria &1 non trovata.
		CPF2112, // L'oggetto &1 in &2 di tipo *&3 già esiste.
		CPF2160, // Il tipo di oggetto &1 non è eleggibile per la funzione
					// richiesta.
		CPD0090, // Il valore del parametro &2 non può essere uguale a &3
		CPD0084, // Il valore &3 non è valido per il parametro &2
	}

	@Inject
	private QTypeRegistry typeRegistry;
	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QJob job;
	@Inject
	private QExceptionManager exceptionManager;
	@Inject
	private QJobLogManager jobLogManager;

	@Inject
	@Main
	public void main(@Supported @DataDef(qualified = true) ObjectNameAndLib object, @Supported @DataDef(length = 7) QCharacter objectType,
			@Supported @DataDef(length = 10) QEnum<TOLIBRARYEnum, QCharacter> toLibrary, @DataDef(length = 10) QEnum<FROMASPDEVICEEnum, QCharacter> fromASPDevice,
			@DataDef(length = 10) QEnum<TOASPDEVICEEnum, QCharacter> toASPDevice) {

		if ("QTEMP".equals(toLibrary.asData().trimR())) {
			throw exceptionManager.prepareException(job, QCPFMSG.CPD0090, new String[] { "", "TOLIB", "QTEMP" });
		}

		QType<?> type = new TypeChecker(typeRegistry).getType(objectType);

		checkType(objectType, type);

		QResourceReader<QTypedObject> originalObjectReader = object.resourceReader(type, job, resourceManager);

		String oldObjectName = object.name.trimR();
		QTypedObject oldObject = originalObjectReader.lookup(oldObjectName);
		if (oldObject == null) {
			throw exceptionManager.prepareException(job, QCPFMSG.CPF2105, new String[] { oldObjectName, object.library.asData().trimR(), objectType.trimR() });
		}

		QResourceWriter<QTypedObject> destinationLibObjectWriter = resourceWriter(type, toLibrary);

		if (destinationLibObjectWriter.exists(oldObjectName)) {
			throw exceptionManager.prepareException(job, QCPFMSG.CPF2112, new String[] { oldObjectName, toLibrary.asData().trimR(), objectType.trimR() });
		}

		QTypedObject duplicatedObject = (QTypedObject) EcoreUtil.copy((EObject) oldObject);
		destinationLibObjectWriter.save(duplicatedObject);

		QResourceWriter<QTypedObject> resourceWriterFrom = resourceWriter(type, oldObject.getLibrary());
		if ((oldObject instanceof QPhysicalFile)) {
			new ObjectDataDuplicator(job.getContext().getAdapter(job, QConnection.class)).duplicateData(oldObject, duplicatedObject);
			new IndexList(job, oldObject).adjustIndexes(resourceWriterFrom, destinationLibObjectWriter, oldObject.getName());
		}

		resourceWriterFrom.delete(oldObject);

		jobLogManager.info(job, "Object " + duplicatedObject.getName() + " of type " + type.getName() + " moved to library " + duplicatedObject.getLibrary());
	}

	@SuppressWarnings("unchecked")
	private QResourceWriter<QTypedObject> resourceWriter(QType<?> type, String library) {
		return (QResourceWriter<QTypedObject>) resourceManager.getResourceWriter(job, type.getTypedClass(), library);
	}

	@SuppressWarnings("unchecked")
	private QResourceWriter<QTypedObject> resourceWriter(QType<?> type, QEnum<TOLIBRARYEnum, QCharacter> toLibrary) {
		QResourceWriter<QTypedObject> resourceReader = null;
		switch (toLibrary.asEnum()) {
		case CURLIB:
			resourceReader = (QResourceWriter<QTypedObject>) resourceManager.getResourceWriter(job, type.getTypedClass(), Scope.CURRENT_LIBRARY);
			break;
		case OTHER:
			resourceReader = (QResourceWriter<QTypedObject>) resourceManager.getResourceWriter(job, type.getTypedClass(), toLibrary.asData().trimR());
			break;
		}
		return resourceReader;
	}

	private void checkType(QCharacter objectType, QType<?> type) {
		if (type == null) {
			throw exceptionManager.prepareException(job, QCPFMSG.CPF2160, new String[] { objectType.trimR() });
		}

		if (type.getTypedClassName().endsWith("QUserProfile")) {
			throw exceptionManager.prepareException(job, QCPFMSG.CPD0084, new String[] { "", "OBJTYPE", objectType.trimR() });
		}
	}

	public static enum TOLIBRARYEnum {
		CURLIB, OTHER
	}

	public static enum FROMASPDEVICEEnum {
		@Special(value = "*")
		TERM_STAR, CURASPGRP, SYSBAS, OTHER
	}

	public static enum TOASPDEVICEEnum {
		ASPDEV, @Special(value = "*")
		TERM_STAR, CURASPGRP, SYSBAS, OTHER
	}
}
