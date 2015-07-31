package org.smeup.sys.os.lib.base.api;

import javax.inject.Inject;

import org.smeup.sys.il.core.QObject;
import org.smeup.sys.il.core.QObjectIterator;
import org.smeup.sys.il.core.out.QObjectWriter;
import org.smeup.sys.il.core.out.QOutputManager;
import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Entry;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.il.data.def.BinaryType;
import org.smeup.sys.os.core.Scope;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobLogManager;
import org.smeup.sys.os.core.resources.QResourceManager;
import org.smeup.sys.os.core.resources.QResourceReader;
import org.smeup.sys.os.lib.QLibrary;

@Program(name = "QMNWRKXX1")
public class LibraryWorker {
	public static enum QCPFMSG {
	}
	
	@Inject
	private QOutputManager outputManager;
	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QJob job;
	@Inject
	private QJobLogManager jobLogManager;

	public @Entry void main(
			@DataDef(qualified = true) LIBRARY library,
			@DataDef(binaryType = BinaryType.SHORT) QEnum<ASPNUMBEREnum, QBinary> aSPNumber,
			@DataDef(length = 10) QEnum<ASPDEVICEEnum, QCharacter> aSPDevice) {
		
		QResourceReader<?> resourceReader = null;
		QObjectIterator<?> objectIterator = null;
		switch (library.nameGeneric.asEnum()) {
		case ALL:
			resourceReader = resourceManager.getResourceReader(job, QLibrary.class, Scope.ALL);
			objectIterator = resourceReader.find(null);
			break;
		case ALLUSR:
			resourceReader = resourceManager.getResourceReader(job, QLibrary.class, Scope.ALL_USER);
			objectIterator = resourceReader.find(null);
			break;
		case CURLIB:
			resourceReader = resourceManager.getResourceReader(job, QLibrary.class, Scope.CURRENT_LIBRARY);
			objectIterator = resourceReader.find(null);
			break;
		case LIBL:
			resourceReader = resourceManager.getResourceReader(job, QLibrary.class, Scope.LIBRARY_LIST);
			objectIterator = resourceReader.find(null);
			break;
		case USRLIBL:
			resourceReader = resourceManager.getResourceReader(job, QLibrary.class, Scope.USER_LIBRARY_LIST);
			objectIterator = resourceReader.find(null);
			break;
		case OTHER:
			resourceReader = resourceManager.getResourceReader(job, QLibrary.class, Scope.ALL);
			objectIterator = resourceReader.find(library.nameGeneric.asData().trimR());
			break;
		}

		QObjectWriter objectWriter = outputManager.getDefaultWriter(job.getContext());
		objectWriter.initialize();

		QObject qObject = null;
		while (objectIterator.hasNext()) {
			try {
				qObject = objectIterator.next();
				objectWriter.write(qObject);
			} catch (Exception e) {
				jobLogManager.error(job, qObject + " " + e.getMessage());
			}
		}		
		objectWriter.flush();
		objectIterator.close();
	}

	public static class LIBRARY extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QEnum<NAMEGENERICEnum, QCharacter> nameGeneric;

		public static enum NAMEGENERICEnum {
			LIBL, CURLIB, USRLIBL, ALLUSR, ALL, OTHER
		}
	}

	public static enum ASPNUMBEREnum {
		@Special(value = "-1")
		ALL, OTHER
	}

	public static enum ASPDEVICEEnum {
		@Special(value = "*")
		TERM_STAR, SYSBAS, CURASPGRP, OTHER
	}
}
