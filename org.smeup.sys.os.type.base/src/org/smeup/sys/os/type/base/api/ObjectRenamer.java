package org.smeup.sys.os.type.base.api;

import javax.inject.Inject;

import org.smeup.sys.dk.core.annotation.Supported;
import org.smeup.sys.dk.core.annotation.Unsupported;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.il.memo.Scope;
import org.smeup.sys.os.core.QExceptionManager;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.type.QType;
import org.smeup.sys.os.type.QTypeRegistry;
import org.smeup.sys.os.type.base.api.tools.ObjectNameAndLib;

@Program(name = "QLIRNOBJ")
public @Supported class ObjectRenamer {
	
	public static enum QCPFMSG {
		CPF2160,     //Il tipo di oggetto *&1 non è eleggibile per la funzione richiesta.                                             
		CPF2105,     //Non trovato oggetto &1 in &2 tipo *&3. 
		CPF2110,     //Libreria &1 non trovata.               
	}
	
	@Inject
	private QTypeRegistry typeRegistry;
	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QJob job;
	@Inject
	private QExceptionManager exceptionManager;

	public @Main void main(@Supported @DataDef(qualified = true) ObjectNameAndLib object,
							@Supported @DataDef(length = 7) QCharacter objectType,
							@Supported @DataDef(length = 10) QCharacter newObject,
							@Unsupported @DataDef(length = 10) QEnum<ASPDEVICEEnum, QCharacter> aSPDevice,
							@Unsupported @DataDef(length = 1) QEnum<SYSTEMEnum, QCharacter> system) {
		
		QType<?> type = type(objectType);
		
		if (type == null) {
			throw exceptionManager.prepareException(job, QCPFMSG.CPF2160, new String[]{objectType.trimR()});			
		}
		
		QResourceWriter<?> resourceWriter = resourceWriter(type, object);
		
		String oldObjectName = object.name.trimR();
		if(!resourceWriter.exists(oldObjectName)) {
			throw exceptionManager.prepareException(job, QCPFMSG.CPF2105, new String[]{oldObjectName, 
																				       object.library.asData().trimR(),
																				       objectType.trimR()});
		}

//		QObjectNameable qObject = resourceWriter.lookup(oldObjectName);
//		
//		resourceWriter.save(qObject);
	}

	public QResourceWriter<?> resourceWriter(QType<?> type, ObjectNameAndLib object) {
		QResourceWriter<?> resourceReader = null;
		switch (object.library.asEnum()) {
		case CURLIB:
			resourceReader = resourceManager.getResourceWriter(job, type.getTypedClass(), Scope.CURRENT_LIBRARY);
			break;
		case LIBL:
			resourceReader = resourceManager.getResourceWriter(job, type.getTypedClass(), Scope.LIBRARY_LIST);
			break;
		case OTHER:
			resourceReader = resourceManager.getResourceWriter(job, type.getTypedClass(), object.library.asData().trimR());
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
		TERM_STAR, 
		CURASPGRP, 
		SYSBAS, 
		OTHER
	}

	public static enum SYSTEMEnum {
		@Special(value = "L") LCL, 
		@Special(value = "R") RMT, 
		@Special(value = "F") FILETYPE
	}
}
