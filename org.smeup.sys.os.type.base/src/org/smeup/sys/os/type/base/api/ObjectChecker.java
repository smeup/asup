package org.smeup.sys.os.type.base.api;

import javax.inject.Inject;

import org.smeup.sys.dk.core.annotation.ToDo;
import org.smeup.sys.dk.source.QSourceEntry;
import org.smeup.sys.dk.source.QSourceManager;
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
import org.smeup.sys.os.file.QFile;
import org.smeup.sys.os.file.QSourceFile;
import org.smeup.sys.os.lib.QLibrary;
import org.smeup.sys.os.type.QType;
import org.smeup.sys.os.type.QTypeRegistry;
import org.smeup.sys.os.type.QTypedObject;

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
	@Inject
	private QSourceManager sourceManager;
	
	
	public @Entry void main(@DataDef(qualified = true) OBJECT object,
							@DataDef(length = 7) QCharacter objectType,
							@DataDef(length = 10) QEnum<MEMBERIFDATABASEFILEEnum, QCharacter> memberIfDataBaseFile,
							@ToDo @DataDef(dimension = 10, length = 10) QEnum<AUTHORITYEnum, QScroller<QCharacter>> authority) {
		
		if (objectType == null || objectType.trimR().equals(""))
			error("You must specify an object type");
		
		QType<?> type = typeRegistry.lookup(objectType.trimR());
		if (type == null)
			error("Wrong type: " + objectType.trimR());			
		
		QResourceReader<? extends QTypedObject> resourceReader = null;
		
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

		QTypedObject typedObject = resourceReader.lookup(object.name.trimR());;
		if (typedObject == null)
			throw exceptionManager.prepareException(job, QCPFMSG.CPF9801, new String[] {"", object.name.trimR(), object.library.asData().trimR()});				
		
		switch (memberIfDataBaseFile.asEnum()) {
		case NONE:
		case FIRST:
			break;
		case OTHER:
			if (typedObject instanceof QSourceFile) {
				QSourceEntry sourceEntry = sourceManager.getObjectEntry(job.getContext(), typedObject.getLibrary(), QFile.class, typedObject.getName());
				QSourceEntry fileMember = sourceManager.getChildEntry(job.getContext(), sourceEntry, memberIfDataBaseFile.asData().trimR()+".XMI");
				if (fileMember == null) {
					throw exceptionManager.prepareException(job, QCPFMSG.CPF9815, new String[] {"", typedObject.getName(), typedObject.getLibrary(), "",  memberIfDataBaseFile.asData().trimR()});											
				}
			} else {
				error("Invalid file type: "+ objectType.trimR());
			}
			break;
		}
	}

	private void error(String message) {
		jobLogManager.error(job, message);
		throw exceptionManager.prepareException(job, QCPFMSG.CPF9899, new String[] {});		
	}

	private void checkLibrary(String libName) {

		QResourceSetReader<QLibrary> resourceReader = resourceManager.getResourceReader(job, QLibrary.class, Scope.ALL);
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
