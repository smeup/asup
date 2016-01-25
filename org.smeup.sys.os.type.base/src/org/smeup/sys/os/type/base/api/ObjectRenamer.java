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

import org.smeup.sys.dk.core.annotation.Supported;
import org.smeup.sys.dk.core.annotation.Unsupported;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.os.core.QExceptionManager;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.type.QType;
import org.smeup.sys.os.type.QTypeRegistry;
import org.smeup.sys.os.type.QTypedObject;
import org.smeup.sys.os.type.base.api.tools.IndexList;
import org.smeup.sys.os.type.base.api.tools.ObjectNameAndLib;
import org.smeup.sys.os.type.base.api.tools.TypeChecker;

@Program(name = "QLIRNOBJ")
public @Supported class ObjectRenamer {

	public static enum QCPFMSG {
		CPD0084, // Il valore &3 non è valido per il parametro &2
		CPF2160, // Il tipo di oggetto &1 non è eleggibile per la funzione richiesta.
		CPF2105, // Non trovato oggetto &1 in &2 tipo *&3.
		CPF2110, // Libreria &1 non trovata.
		CPF2112, //Esiste già l'oggetto &1 in &2 di tipo *&3.
	}

	@Inject
	private QTypeRegistry typeRegistry;
	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QJob job;
	@Inject
	private QExceptionManager exceptionManager;
	
	@Main
	public void main(@Supported @DataDef(qualified = true) ObjectNameAndLib object, 
					 @Supported @DataDef(length = 7) QCharacter objectType, 
					 @Supported @DataDef(length = 10) QCharacter newObject,
			         @Unsupported @DataDef(length = 10) QEnum<ASPDEVICEEnum, QCharacter> aSPDevice, @Unsupported @DataDef(length = 1) QEnum<SYSTEMEnum, QCharacter> system) {
		QType<?> type = new TypeChecker(typeRegistry).getType(objectType);

		checkType(objectType, type);
		
		QResourceReader<QTypedObject> resourceReader = object.resourceReader(type, job, resourceManager);

		String oldObjectName = object.name.trimR();
		if (!resourceReader.exists(oldObjectName)) {
			throw exceptionManager.prepareException(job, QCPFMSG.CPF2105, new String[] {oldObjectName, object.library.asData().trimR(), objectType.trimR()});
		}

		String newName = newObject.trimR();
		if (resourceReader.exists(newName)) {
			throw exceptionManager.prepareException(job, QCPFMSG.CPF2112, new String[] {newName, object.library.asData().trimR(), objectType.trimR()});
		}
		
		QTypedObject objToRename = (QTypedObject) resourceReader.lookup(oldObjectName);
		
		QResourceWriter<QTypedObject>resourceWriter = resourceWriter(type,  objToRename.getLibrary());
		resourceWriter.rename(objToRename, newName);
		new IndexList(job, objToRename).adjustIndexes(resourceWriter, resourceWriter, objToRename.getLibrary(), newName);
	}


	@SuppressWarnings("unchecked")
	private QResourceWriter<QTypedObject> resourceWriter(QType<?> type,	String library) {
		return (QResourceWriter<QTypedObject>) resourceManager.getResourceWriter(job, type.getTypedClass(), library);
	}


	private void checkType(QCharacter objectType, QType<?> type) {
		if (type == null) {
			throw exceptionManager.prepareException(job, QCPFMSG.CPF2160, new String[] {objectType.trimR()});
		}
		
		if (type.getTypedClassName().endsWith("QUserProfile") ) {
			throw exceptionManager.prepareException(job, QCPFMSG.CPD0084, new String[] {"", "OBJTYPE", objectType.trimR()});			
		}
	}


	public static enum ASPDEVICEEnum {
		@Special(value = "*")
		TERM_STAR, CURASPGRP, SYSBAS, OTHER
	}

	public static enum SYSTEMEnum {
		@Special(value = "L")
		LCL, @Special(value = "R")
		RMT, @Special(value = "F")
		FILETYPE
	}
}
