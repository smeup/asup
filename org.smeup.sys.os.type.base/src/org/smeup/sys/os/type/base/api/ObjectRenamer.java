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

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.eclipse.datatools.modelbase.sql.constraints.Index;
import org.eclipse.datatools.modelbase.sql.tables.Table;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.smeup.sys.db.core.QConnection;
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
import org.smeup.sys.il.memo.Scope;
import org.smeup.sys.os.core.QExceptionManager;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.file.QLogicalFile;
import org.smeup.sys.os.file.QPhysicalFile;
import org.smeup.sys.os.type.QType;
import org.smeup.sys.os.type.QTypeRegistry;
import org.smeup.sys.os.type.QTypedObject;
import org.smeup.sys.os.type.base.api.tools.ObjectNameAndLib;

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
		QType<?> type = type(objectType);

		checkType(objectType, type);
		
		QResourceReader<QTypedObject> resourceReader = resourceReader(type, object);

		String oldObjectName = object.name.trimR();
		if (!resourceReader.exists(oldObjectName)) {
			throw exceptionManager.prepareException(job, QCPFMSG.CPF2105, new String[] {oldObjectName, object.library.asData().trimR(), objectType.trimR()});
		}

		String newName = newObject.trimR();
		if (resourceReader.exists(newName)) {
			throw exceptionManager.prepareException(job, QCPFMSG.CPF2112, new String[] {newName, object.library.asData().trimR(), objectType.trimR()});
		}
		
		QTypedObject objToRename = (QTypedObject) resourceReader.lookup(oldObjectName);
		List<String> indexNames = findIndexesFor(objToRename);
		QTypedObject duplicatedObject = (QTypedObject) EcoreUtil.copy((EObject) objToRename);
		duplicatedObject.setName(newName);
		
		QResourceWriter<QTypedObject>resourceWriter = resourceWriter(type,  objToRename.getLibrary());
		resourceWriter.rename(objToRename, duplicatedObject);
		adjustIndexes(resourceWriter, newName, objToRename, indexNames);
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


	private void adjustIndexes(QResourceWriter<QTypedObject> resourceWriter, String newName, QTypedObject objToRename, List<String> indexNames) {
		for (String indexName : indexNames) {
			QLogicalFile logical = (QLogicalFile) resourceWriter.lookup(indexName);
			String creationStmt = logical.getCreationStatement();
			if (creationStmt != null) {
				String newSQL = creationStmt.replace(objToRename.getName(), newName);
				logical.setCreationStatement(newSQL);
			}
			List<String> tables = logical.getTables();
			tables.remove(objToRename.getName());
			tables.add(newName);
			resourceWriter.delete(logical);
			resourceWriter.save(logical);
		}
	}


	@SuppressWarnings("unchecked")
	private List<String> findIndexesFor(QTypedObject objToRename) {
		List<String> indexNames = new ArrayList<String>();
		if (objToRename instanceof QPhysicalFile) {
			QConnection connection = job.getContext().getAdapter(job, QConnection.class);
			Table table = connection.getCatalogMetaData().getTable(objToRename.getLibrary(), objToRename.getName());
			for (Index newIndex : (List<Index>) table.getIndex()) {
				if (!newIndex.isSystemGenerated()) {
					indexNames.add(newIndex.getName());
				}
			}
		}
		return indexNames;
	}


	@SuppressWarnings("unchecked")
	private QResourceReader<QTypedObject> resourceReader(QType<?> type, ObjectNameAndLib object) {
		QResourceReader<QTypedObject> resourceReader = null;
		switch (object.library.asEnum()) {
		case CURLIB:
			resourceReader = (QResourceReader<QTypedObject>) resourceManager.getResourceReader(job, type.getTypedClass(), Scope.CURRENT_LIBRARY);
			break;
		case LIBL:
			resourceReader = (QResourceReader<QTypedObject>) resourceManager.getResourceReader(job, type.getTypedClass(), Scope.LIBRARY_LIST);
			break;
		case OTHER:
			resourceReader = (QResourceReader<QTypedObject>) resourceManager.getResourceReader(job, type.getTypedClass(), object.library.asData().trimR());
			break;
		}
		return resourceReader;
	}

	private QType<?> type(QCharacter typeAsQCharacter) {
		String objectTypeString = typeAsQCharacter.trimR();
		if (objectTypeString != null && !"".equals(objectTypeString)) {
			QType<?> typeFound = typeRegistry.lookup(translateTypeName(objectTypeString));
			if (typeFound != null) {
				return typeFound;
			}
		}
		return null;
	}

	private String translateTypeName(String objectTypeString) {
		if (objectTypeString.startsWith("*")) {
			return objectTypeString;
		}
		return "*" + objectTypeString;
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
