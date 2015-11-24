package org.smeup.sys.os.module.base.api;


import java.io.IOException;

import javax.inject.Inject;

import org.smeup.sys.dk.core.annotation.Supported;
import org.smeup.sys.il.core.QObjectIterator;
import org.smeup.sys.il.core.out.QObjectWriter;
import org.smeup.sys.il.core.out.QOutputManager;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.il.memo.Scope;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.module.QModule;

@Program(name = "QMNWRKMOD")
public @Supported class ModuleWorker {
	public static enum QCPFMSG {
	}
	
	@Inject
	private QOutputManager outputManager;
	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QJob job;

	@Main
	public void main(
			@Supported @DataDef(qualified = true) MODULE_SPECIFICATION moduleSpecification,
			@DataDef(length = 10) QEnum<MODULEATTRIBUTEEnum, QCharacter> moduleAttribute) {
	
		QResourceReader<QModule> moduleReader = findReader(moduleSpecification);
		QObjectWriter objectWriter = outputManager.getDefaultWriter(job.getContext());
		objectWriter.initialize();

		try (QObjectIterator<QModule> userProfileIterator = findIterator(moduleSpecification, moduleReader)) {
			while (userProfileIterator.hasNext()) {
				QModule qUserProfile = userProfileIterator.next();
				try {
					objectWriter.write(qUserProfile);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		objectWriter.flush();
	}

	private QResourceReader<QModule> findReader(MODULE_SPECIFICATION object) {
		QResourceReader<QModule> resourceReader = null;
		switch (object.library.asEnum()) {
		case ALL:
			break;
		case ALLUSR:
			resourceReader = resourceManager.getResourceReader(job,	QModule.class, Scope.ALL_USER);
			break;
		case CURLIB:
			resourceReader = resourceManager.getResourceReader(job,	QModule.class, Scope.CURRENT_LIBRARY);
			break;
		case LIBL:
			resourceReader = resourceManager.getResourceReader(job,	QModule.class, Scope.LIBRARY_LIST);
			break;
		case USRLIBL:
			resourceReader = resourceManager.getResourceReader(job,	QModule.class, Scope.USER_LIBRARY_LIST);
			break;
		case OTHER:
			resourceReader = resourceManager.getResourceReader(job,	QModule.class, object.library.asData().trimR());
			break;
		}
		return resourceReader;
	}

	@SuppressWarnings("resource")
	private QObjectIterator<QModule> findIterator(MODULE_SPECIFICATION nameGeneric, QResourceReader<QModule> resourceReader) {
		QObjectIterator<QModule> result = null;
		switch (nameGeneric.nameGeneric.asEnum()) {
		case ALL:
			result = resourceReader.find(null);
			break;
		case OTHER:
			result = resourceReader.find(nameGeneric.nameGeneric.asData().trimR());
			break;
		}
		return result;
	}

	public static class MODULE_SPECIFICATION extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QEnum<NAMEGENERICEnum, QCharacter> nameGeneric;
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<LIBRARYEnum, QCharacter> library;

		public static enum NAMEGENERICEnum {
			ALL, OTHER
		}

		public static enum LIBRARYEnum {
			LIBL, CURLIB, USRLIBL, ALLUSR, ALL, OTHER
		}
	}

	public static enum MODULEATTRIBUTEEnum {
		@Special(value = "ALLPGM")
		ALL, @Special(value = "ASM38")
		ASM38, @Special(value = "BAS")
		BAS, @Special(value = "BAS38")
		BAS38, @Special(value = "CBL")
		CBL, @Special(value = "CBLLE")
		CBLLE, @Special(value = "CBL36")
		CBL36, @Special(value = "CBL38")
		CBL38, @Special(value = "CLE")
		CLE, @Special(value = "CLLE")
		CLLE, @Special(value = "CLP")
		CLP, @Special(value = "CLP38")
		CLP38, @Special(value = "CPPLE")
		CPPLE, @Special(value = "CSP")
		CSP, @Special(value = "DFU")
		DFU, @Special(value = "DFUEXC")
		DFUEXC, @Special(value = "DFUNOTEXC")
		DFUNOTEXC, @Special(value = "FTN")
		FTN, @Special(value = "PAS")
		PAS, @Special(value = "PAS38")
		PAS38, @Special(value = "PLI")
		PLI, @Special(value = "PLI38")
		PLI38, @Special(value = "RMC")
		RMC, @Special(value = "RPG")
		RPG, @Special(value = "RPGLE")
		RPGLE, @Special(value = "RPG36")
		RPG36, @Special(value = "RPG38")
		RPG38
	}
}
