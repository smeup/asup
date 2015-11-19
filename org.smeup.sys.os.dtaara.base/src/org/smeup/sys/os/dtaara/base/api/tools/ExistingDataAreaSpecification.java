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
package org.smeup.sys.os.dtaara.base.api.tools;

import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.il.memo.QResourceSetReader;
import org.smeup.sys.il.memo.Scope;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.dtaara.QDataArea;
import org.smeup.sys.os.dtaara.QDataAreaManager;
import org.smeup.sys.os.lib.QLibrary;

public class ExistingDataAreaSpecification extends QDataStructWrapper {

	private static final long serialVersionUID = 1L;

	@DataDef(length = 10)
	public QCharacter name;

	@DataDef(length = 10, value = "*LIBL")
	public QEnum<LIBRARYEnum, QCharacter> library;

	public static enum LIBRARYEnum {
		LIBL, CURLIB, OTHER
	}

	public static enum DATAAREAEnum {
		LDA, GDA, PDA, OTHER
	}

	public QDataArea findDataArea(QJob job, QResourceManager resourceManager, QDataAreaManager dataAreaManager, DATAAREAEnum dataAreaType) throws DataAreaNotFoundException, LibraryNotFoundException {
		switch (dataAreaType) {
		case LDA:
			return dataAreaManager.getLocalDataArea(job.getContext());
		case OTHER:
			String dataAreaName = name.trimR();
			String libraryName = library.asData().trimR();
			QDataArea result = findReader(job, resourceManager).lookup(dataAreaName);
			if (result == null) {
				throw new DataAreaNotFoundException(dataAreaName, libraryName);
			}
			return result;
		default:
			throw new UnsupportedOperationException("Unsupported DTAARA Type: " + dataAreaType);
		}
	}

	private QResourceReader<QDataArea> findReader(QJob job, QResourceManager resourceManager) throws LibraryNotFoundException {
		QResourceReader<QDataArea> resourceReader = null;
		switch (library.asEnum()) {
		case CURLIB:
			resourceReader = resourceManager.getResourceReader(job, QDataArea.class, Scope.CURRENT_LIBRARY);
			break;
		case LIBL:
			resourceReader = resourceManager.getResourceReader(job, QDataArea.class, Scope.LIBRARY_LIST);
			break;
		case OTHER:
			String libraryName = library.asData().trimR();
			checkLibrary(resourceManager, job, libraryName, name.trimR());
			resourceReader = resourceManager.getResourceReader(job, QDataArea.class, libraryName);
			break;
		}
		return resourceReader;
	}

	private void checkLibrary(QResourceManager resourceManager, QJob job, String libraryName, String dataAreaName) throws LibraryNotFoundException {
		QResourceSetReader<QLibrary> resourceReader = resourceManager.getResourceReader(job, QLibrary.class, Scope.ALL);
		if (!resourceReader.exists(libraryName)) {
			throw new LibraryNotFoundException(dataAreaName, libraryName);
		}
	}

	public class LibraryNotFoundException extends Exception {
		private static final long serialVersionUID = 1L;

		public final String dataAreaName;
		public final String libraryName;

		public LibraryNotFoundException(String dataAreaName, String libraryName) {
			this.dataAreaName = dataAreaName;
			this.libraryName = libraryName;
		}
	}

	public class DataAreaNotFoundException extends Exception {
		private static final long serialVersionUID = 1L;

		public final String dataAreaName;
		public final String libraryName;

		public DataAreaNotFoundException(String dataAreaName, String libraryName) {
			this.dataAreaName = dataAreaName;
			this.libraryName = libraryName;
		}
	}
}
