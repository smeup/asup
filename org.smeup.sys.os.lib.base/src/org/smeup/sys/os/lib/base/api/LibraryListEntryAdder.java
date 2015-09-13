/**
 *  Copyright (c) 2012, 2015 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.smeup.sys.os.lib.base.api;

import java.util.Collections;
import java.util.List;

import javax.inject.Inject;

import org.smeup.sys.il.core.java.QLists;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Entry;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.os.core.QExceptionManager;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.lib.QLibrary;
import org.smeup.sys.os.lib.QLibraryManager;

@Program(name = "QLICUSRL")
public class LibraryListEntryAdder {

	public static enum QCPFMSG {
		CPF2110, CPF2149
	}
	
	@Inject
	private QJob job;
	@Inject
	private QLibraryManager libraryManager;
	@Inject
	private QLists lists;
	@Inject
	private QExceptionManager exceptionManager;
	
	@Entry
	public void main(@DataDef(length = 10) QCharacter library, QEnum<LibraryListPositionEnum, LibraryListPosition> libraryListPosition) {
		QResourceWriter<QLibrary> libraryWriter = libraryManager.getLibraryWriter(job);	
		String newLibName = library.trimR();
		QLibrary qLib = libraryWriter.lookup(newLibName);
		
		if (qLib == null) {
			throw exceptionManager.prepareException(job, QCPFMSG.CPF2110, new String[] {newLibName});	
		}
		
		switch (libraryListPosition.asEnum()) {
		case FIRST:
			lists.addFirst(job.getLibraries(), library.trimR());
			break;
		case LAST:
			lists.addLast(job.getLibraries(), library.trimR());
			break;
		case OTHER:
			String oldLibName = libraryListPosition.asData().referenceLibrary.trimR();
			if (!job.getLibraries().contains(oldLibName)) {
				throw exceptionManager.prepareException(job, QCPFMSG.CPF2149, new String[] {oldLibName});				
			}
			substitute(libraryListPosition.asData().listPosition.asEnum(), oldLibName, newLibName, job.getLibraries());
			break;
		}
	}


	private void substitute(LibraryListPosition.ListPositionEnum libPositionEnum, String oldLib, String newLib, List<String> libraries) {
		switch (libPositionEnum) {
		case AFTER:
			lists.addAfter(libraries, oldLib, newLib);
			break;

		case BEFORE:
			lists.addBefore(libraries, oldLib, newLib);
			break;

		case REPLACE:
			Collections.replaceAll(job.getLibraries(), oldLib, newLib);
			break;
		}
	}

	public static class LibraryListPosition extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 1)
		public QEnum<ListPositionEnum, QCharacter> listPosition;
		@DataDef(length = 10)
		public QCharacter referenceLibrary;

		public static enum ListPositionEnum {
			@Special(value = "A")
			AFTER, @Special(value = "B")
			BEFORE, @Special(value = "R")
			REPLACE
		}
	}

	public static enum LibraryListPositionEnum {
		@Special(value = "F")
		FIRST, @Special(value = "L")
		LAST, OTHER
	}

}