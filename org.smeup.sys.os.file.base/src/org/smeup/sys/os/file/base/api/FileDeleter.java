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

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.inject.Inject;

import org.eclipse.datatools.modelbase.sql.tables.Table;
import org.smeup.sys.db.core.QConnection;
import org.smeup.sys.db.core.QDatabaseManager;
import org.smeup.sys.dk.core.annotation.Supported;
import org.smeup.sys.dk.core.annotation.ToDo;
import org.smeup.sys.il.core.QObjectIterator;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.QExceptionManager;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobLogManager;
import org.smeup.sys.os.file.QFile;
import org.smeup.sys.os.file.QPhysicalFile;

@Program(name = "QASDLTF")
public @Supported class FileDeleter {
	public static enum QCPFMSG {
		CPF2125, CPF2105, CPF3219
	}


	@Inject
	private QDatabaseManager databaseManager;
	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QJob job;
	@Inject
	private QJobLogManager jobLogManager;
	@Inject
	private QExceptionManager exceptionManager;
	
	@Main 
	public void main(
			@Supported @DataDef(qualified = true) FileRef file,
			@ToDo @DataDef(length = 1) QEnum<SYSTEMEnum, QCharacter> system,
			@ToDo @DataDef(length = 10) QEnum<REMOVECONSTRAINTEnum, QCharacter> removeConstraint) {

		QResourceWriter<QFile> fileWriter = resourceManager.getResourceWriter(job, QFile.class, file.library.asEnum(), file.library.asData().trimR());

		QObjectIterator<QFile> files = fileWriter.find(file.name.trimR());
		if(!files.hasNext()) {
			files.close();
			throw exceptionManager.prepareException(job, QCPFMSG.CPF2105, new String[] {file.name.trimR(), file.library.asData().trimR(), "FILE"});	
		}
		SplittedSet splittedSet = new SplittedSet(files);
		files.close();
		
		boolean deleteOccured = false;
		for (QFile qFile : splittedSet.nonPhysicalFiles) {
			fileWriter.delete(qFile);
			deleteOccured = true;
		}

		List<QPhysicalFile> warnings = new ArrayList<QPhysicalFile>();
		for (QPhysicalFile qFile : splittedSet.physicalFiles) {
			if (hasLogicals(qFile)) {
				warnings.add(qFile);
			} else {
				fileWriter.delete(qFile);
				deleteOccured = true;
			}
		}

		logLogicalsExceptions(warnings);
		
		if (!deleteOccured) {
			throw exceptionManager.prepareException(job, QCPFMSG.CPF2125, new String[] {});							
		}
	}

	private void logLogicalsExceptions(List<QPhysicalFile> warnings) {
		for (QPhysicalFile qPhysicalFile : warnings) {
			jobLogManager.warning(job, exceptionManager.prepareException(job, QCPFMSG.CPF3219, new String[] {qPhysicalFile.getName(), qPhysicalFile.getLibrary()}).getMessageText());
		}
	}

	private boolean hasLogicals(QPhysicalFile qFile) {
		try {
			QConnection connection = job.getContext().getAdapter(job, QConnection.class);
			Table table = connection.getCatalogMetaData().getTable(qFile.getLibrary(), qFile.getName());
			return databaseManager.hasLogicals(connection, table);
		} catch (SQLException e) {
			throw new OperatingSystemRuntimeException(e.getMessage());
		}
	}

	private class SplittedSet {
		final Set<QPhysicalFile> physicalFiles = new HashSet<QPhysicalFile>();
		final Set<QFile> nonPhysicalFiles = new HashSet<QFile>();

		public SplittedSet(QObjectIterator<QFile> files) {
			while(files.hasNext()) {
				QFile qFile = files.next();
				if (qFile instanceof QPhysicalFile) {
					this.physicalFiles.add((QPhysicalFile)qFile);
				} else {
					this.nonPhysicalFiles.add(qFile);					
				}
			}
		}
	}

	public static enum SYSTEMEnum {
		@Special(value = "L")
		LCL, @Special(value = "R")
		RMT, @Special(value = "F")
		FILETYPE
	}

	public static enum REMOVECONSTRAINTEnum {
		RESTRICT, REMOVE, KEEP
	}
}
