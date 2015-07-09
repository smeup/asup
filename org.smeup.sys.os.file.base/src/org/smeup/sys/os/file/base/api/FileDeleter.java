package org.smeup.sys.os.file.base.api;

import javax.inject.Inject;

import org.smeup.sys.dk.core.annotation.Supported;
import org.smeup.sys.dk.core.annotation.ToDo;
import org.smeup.sys.il.core.QObjectIterator;
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
import org.smeup.sys.os.core.resources.QResourceWriter;
import org.smeup.sys.os.file.QFile;

@Program(name = "QASDLTF")
public @Supported class FileDeleter {
	public static enum QCPFMSG {
		CPF2125, CPF2105
	}

	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QJob job;
	
	public @Entry void main(
			@Supported @DataDef(qualified = true) FILE file,
			@ToDo @DataDef(length = 1) QEnum<SYSTEMEnum, QCharacter> system,
			@ToDo @DataDef(length = 10) QEnum<REMOVECONSTRAINTEnum, QCharacter> removeConstraint) {

		QResourceWriter<QFile> fileWriter = null;

		switch (file.library.asEnum()) {
		case CURLIB:
			fileWriter = resourceManager.getResourceWriter(job, QFile.class, Scope.CURRENT_LIBRARY);
			break;
		case LIBL:
			fileWriter = resourceManager.getResourceWriter(job, QFile.class, Scope.LIBRARY_LIST);
			break;
		case ALL:
			fileWriter = resourceManager.getResourceWriter(job, QFile.class, Scope.ALL);
			break;
		case ALLUSR:
			fileWriter = resourceManager.getResourceWriter(job, QFile.class, Scope.ALL_USER);
			break;
		case USRLIBL:
			fileWriter = resourceManager.getResourceWriter(job, QFile.class, Scope.USER_LIBRARY_LIST);
			break;
		case OTHER:
			fileWriter = resourceManager.getResourceWriter(job, QFile.class, file.library.asData().trimR());
			break;
		}

		QObjectIterator<QFile> files = fileWriter.find(file.nameGeneric.trimR());
		if(!file.nameGeneric.trimR().endsWith("*") && !files.hasNext())
			throw new OperatingSystemRuntimeException("File " + file.nameGeneric + " not exists in library " + file.library);
		
		while(files.hasNext()) {
			QFile qFile = files.next();
			System.out.println(qFile);

			fileWriter.delete(qFile);
		}

		files.close();
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
