package org.smeup.sys.os.pgm.base.api;

import javax.inject.Inject;

import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Overlay;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.il.data.def.BinaryType;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.il.memo.Scope;
import org.smeup.sys.os.core.QExceptionManager;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.pgm.QProgram;

@Program(name = "QBNLPGMI")
public class ProgramInformationListIle {
	public static enum QCPFMSG {
		CPF9810, // Library &1 not found
		CPF9811 // Program &1 in library &2 not found
	}

	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QJob job;
	@Inject
	private QExceptionManager exceptionManager;

	@Main
	public void main(@DataDef(length = 20) USERSPACE qualifiedUserSpaceName,
			@DataDef(length = 8) QEnum<FORMATEnum, QCharacter> formatName, 
			@DataDef(qualified = true) ProgramRef qualifiedIleProgramName, 
			QUSEC qusec) {

		QResourceReader<QProgram> resource = null;
		String library = null;
		switch (qualifiedIleProgramName.library.asEnum()) {
		case LIBL:
			resource = resourceManager.getResourceReader(job, QProgram.class, Scope.LIBRARY_LIST);
			break;
		case USRLIBL:
			resource = resourceManager.getResourceReader(job, QProgram.class, Scope.USER_LIBRARY_LIST);
			break;
		case CURLIB:
			resource = resourceManager.getResourceWriter(job, QProgram.class, Scope.CURRENT_LIBRARY);
			break;
		case ALL:
			resource = resourceManager.getResourceWriter(job, QProgram.class, Scope.ALL);
			break;
		case ALLUSR:
			resource = resourceManager.getResourceWriter(job, QProgram.class, Scope.ALL_USER);
			break;
		case OTHER:
			library = qualifiedIleProgramName.library.asData().trimR();
			resource = resourceManager.getResourceWriter(job, QProgram.class, library);
			break;
		}

		QProgram qProgram = resource.lookup(qualifiedIleProgramName.name.trimR());
		if (qProgram == null)
			throw exceptionManager.prepareException(job, QCPFMSG.CPF9811, new String[] { qualifiedIleProgramName.name.trimR(), qualifiedIleProgramName.library.asData().trimR() });

		switch (formatName.asEnum()) {
		case PGML0100:
			break;
		case PGML0110:
			break;
		case PGML0200:
			break;
		case PGML0300:
			break;
		case PGML0400:
			break;
		case PGML0500:
			break;
		}
	}

	public static enum FORMATEnum {
		@Special(value = "PGML0100") PGML0100, 
		@Special(value = "PGML0100") PGML0110, 
		@Special(value = "PGML0200") PGML0200, 
		@Special(value = "PGML0300") PGML0300,
		@Special(value = "PGML0300") PGML0400,
		@Special(value = "PGML0300") PGML0500;
	}

	public static class USERSPACE extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter name;
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<Scope, QCharacter> library;
	}
	
	public static class QUSEC extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(binaryType = BinaryType.INTEGER, value = "16")
		@Overlay(position = 1)
		public QBinary qusbprv;
		@DataDef(binaryType = BinaryType.INTEGER)
		@Overlay(position = 5)
		public QBinary qusbavl;
		@DataDef(length = 7)
		@Overlay(position = 9)
		public QCharacter qusei;
		@DataDef(length = 1)
		@Overlay(position = 16)
		public QCharacter quserved;
	}
}
