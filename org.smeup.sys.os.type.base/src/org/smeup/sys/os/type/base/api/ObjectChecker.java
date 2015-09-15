package org.smeup.sys.os.type.base.api;

import javax.inject.Inject;

import org.smeup.sys.dk.core.annotation.ToDo;
import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.QScroller;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Entry;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.il.memo.QResourceSetReader;
import org.smeup.sys.il.memo.Scope;
import org.smeup.sys.os.core.QExceptionManager;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobLogManager;
import org.smeup.sys.os.type.QType;
import org.smeup.sys.os.type.QTypeRegistry;

@Program(name = "QLICKOBJ")
public @ToDo class ObjectChecker {
	
	public static enum QCPFMSG {
		CPF9801, CPF9815, CPF9810, CPF9899
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
	
	public @Entry void main(@DataDef(qualified = true) OBJECT object,
							@DataDef(length = 7) QCharacter objectType,
							@DataDef(length = 10) QEnum<MEMBERIFDATABASEFILEEnum, QCharacter> memberIfDataBaseFile,
							@ToDo @DataDef(dimension = 10, length = 10) QEnum<AUTHORITYEnum, QScroller<QCharacter>> authority) {
		
		if (objectType == null || objectType.trimR().equals("")) {
			error("You must specify an object type");
		}
		
		QType<?> type = typeRegistry.lookup(objectType.trimR());

		if (type == null) {
			error("Wrong type: " + objectType.trimR());			
		}
		
		QResourceReader<?> resourceReader = null;
		
		switch (object.library.asEnum()) {
		case CURLIB:
			resourceReader = resourceManager.getResourceReader(job, type.getTypedClass(), Scope.CURRENT_LIBRARY);
			break;
		case LIBL:
			resourceReader = resourceManager.getResourceReader(job, type.getTypedClass(), Scope.LIBRARY_LIST);
			break;
		case OTHER:
			checkLibrary(object.library.asData().trimR());
			resourceReader = resourceManager.getResourceReader(job, type.getTypedClass(), object.library.asData().trimR());
			break;
		}

		QObjectNameable objectNameable = resourceReader.lookup(object.name.trimR());;

		if (objectNameable == null) {
			throw exceptionManager.prepareException(job, QCPFMSG.CPF9801, new String[] {"", object.name.trimR(), object.library.asData().trimR()});				
		}
	}

	private void error(String message) {
		jobLogManager.error(job, message);
		throw exceptionManager.prepareException(job, QCPFMSG.CPF9899, new String[] {});		
	}

	private void checkLibrary(String libName) {
		QType<?> libType = typeRegistry.lookup("*LIB");
		QResourceSetReader<?> resourceReader = resourceManager.getResourceReader(job, libType.getTypedClass(), Scope.ALL);
		if (!resourceReader.exists(libName))
			throw exceptionManager.prepareException(job, QCPFMSG.CPF9810, new String[] {libName});	
	}
	
	public static class OBJECT extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		
		@DataDef(length = 10)
		public QCharacter name;
		
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<LIBRARYEnum, QCharacter> library;

		public static enum LIBRARYEnum {
			LIBL, CURLIB, OTHER
		}
	}


	public static enum MEMBERIFDATABASEFILEEnum {
		NONE, FIRST, OTHER
	}

	public static enum AUTHORITYEnum {
		NONE, ALL, CHANGE, USE, EXCLUDE, AUTLMGT, OBJALTER, OBJEXIST, OBJMGT, OBJOPR, OBJREF, ADD, DLT, EXECUTE, READ, UPD
	}
}
