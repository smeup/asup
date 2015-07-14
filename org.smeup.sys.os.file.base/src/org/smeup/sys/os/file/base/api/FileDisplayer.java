package org.smeup.sys.os.file.base.api;

import java.io.IOException;

import javax.inject.Inject;

import org.smeup.sys.il.core.QObject;
import org.smeup.sys.il.core.QObjectIterator;
import org.smeup.sys.il.core.out.QObjectWriter;
import org.smeup.sys.il.core.out.QOutputManager;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Entry;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.Scope;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.resources.QResourceManager;
import org.smeup.sys.os.core.resources.QResourceReader;
import org.smeup.sys.os.file.QFile;

@Program(name = "QNFBROWS")
public class FileDisplayer {
	public static enum QCPFMSG {
	}

	@Inject
	private QOutputManager outputManager;
	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QJob job;
	
	public @Entry void main(@DataDef(qualified = true) FILE file,
			                @DataDef(length = 1) QEnum<OUTPUTEnum, QCharacter> output) {
		
		QResourceReader<QFile> fileReader = null;

		switch (file.library.asEnum()) {
		case CURLIB:
			fileReader = resourceManager.getResourceWriter(job, QFile.class, Scope.CURRENT_LIBRARY);
			break;
		case LIBL:
			fileReader = resourceManager.getResourceWriter(job, QFile.class, Scope.LIBRARY_LIST);
			break;
		case ALL:
			fileReader = resourceManager.getResourceWriter(job, QFile.class, Scope.ALL);
			break;
		case ALLUSR:
			fileReader = resourceManager.getResourceWriter(job, QFile.class, Scope.ALL_USER);
			break;
		case USRLIBL:
			fileReader = resourceManager.getResourceWriter(job, QFile.class, Scope.USER_LIBRARY_LIST);
			break;
		case OTHER:
			fileReader = resourceManager.getResourceWriter(job, QFile.class, file.library.asData().trimR());
			break;
		}

		QObjectIterator<QFile> files = fileReader.find(file.nameGeneric.trimR());
		if(!files.hasNext())
			throw new OperatingSystemRuntimeException("File " + file.nameGeneric.trimR() + " not found in library " + file.library);
		
		QObjectWriter objectWriter = outputManager.getObjectWriter(job.getContext(), output.asData().trimR());
		objectWriter.initialize();
		
		QObject record = null;
		try {
			objectWriter.write(record);
		} catch (IOException e) {
			throw new OperatingSystemRuntimeException(e);
		}
		
		throw new UnsupportedOperationException("Da implementare");
	}

	public static class FILE extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter nameGeneric;
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<LIBRARYEnum, QCharacter> library;

		public static enum LIBRARYEnum {
			LIBL, CURLIB, USRLIBL, ALL, ALLUSR, OTHER
		}
	}
	
//	public static class FILE extends QDataStructWrapper {
//		private static final long serialVersionUID = 1L;
//		@DataDef(length = 10)
//		public QEnum<NAMEGENERICEnum, QCharacter> nameGeneric;
//		@DataDef(length = 10)
//		public QEnum<LIBRARYEnum, QCharacter> library;
//
//		public static enum NAMEGENERICEnum {
//			ALL, OTHER
//		}
//
//		public static enum LIBRARYEnum {
//			LIBL, CURLIB, USRLIBL, ALL, ALLUSR, OTHER
//		}
//	}

	public static enum OUTPUTEnum {
		@Special(value = "*")
		TERM_STAR, @Special(value = "P")
		PRINT
	}
}
