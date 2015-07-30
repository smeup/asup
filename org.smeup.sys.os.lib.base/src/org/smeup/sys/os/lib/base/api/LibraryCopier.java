package org.smeup.sys.os.lib.base.api;

import javax.inject.Inject;

import org.smeup.sys.dk.core.annotation.Supported;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Entry;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.os.cmd.QCommandManager;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.resources.QResourceWriter;
import org.smeup.sys.os.lib.QLibrary;
import org.smeup.sys.os.lib.QLibraryManager;
import org.smeup.sys.os.lib.QOperatingSystemLibraryFactory;

@Program(name = "QMNCPYL")
public @Supported class LibraryCopier {
	public static enum QCPFMSG {
	}
	
	@Inject
	private QJob job;
	@Inject
	private QLibraryManager libraryManager;
	@Inject
	private QCommandManager commandManager;
	
	public @Entry void main(
			@Supported @DataDef(length = 10) QCharacter existingLibrary,
			@Supported @DataDef(length = 10) QCharacter newLibrary,
			@Supported @DataDef(length = 4) QEnum<CREATELIBRARYEnum, QCharacter> createLibrary,
			@Supported @DataDef(length = 4) QEnum<DUPLICATEDATAEnum, QCharacter> duplicateData,
			@DataDef(length = 4) QEnum<DUPLICATECONSTRAINTSEnum, QCharacter> duplicateConstraints,
			@DataDef(length = 4) QEnum<DUPLICATETRIGGERSEnum, QCharacter> duplicateTriggers,
			@DataDef(length = 4) QEnum<DUPLICATEFILEIDENTIFIERSEnum, QCharacter> duplicateFileIdentifiers) {
		
		QResourceWriter<QLibrary> libraryWriter = libraryManager.getLibraryWriter(job);	
		
		String newLibName = newLibrary.trimR();
		QLibrary qNewLibrary = libraryWriter.lookup(newLibName);
		
		switch (createLibrary.asEnum()) {
		case YES:
			if (qNewLibrary != null) {
				throw new OperatingSystemRuntimeException("Destination library " + newLibName + " already exists");
			}
			qNewLibrary = QOperatingSystemLibraryFactory.eINSTANCE.createLibrary();
			qNewLibrary.setName(newLibName);
			libraryWriter.save(qNewLibrary);
			break;

		case NO:
			if (qNewLibrary == null) {
				throw new OperatingSystemRuntimeException("Destination library " + newLibName + " does not exist");
			}
			break;
		}

		String command = 
				"CRTDUPOBJ OBJ(*ALL)" +
			    " FROMLIB(" + existingLibrary.trimR() + ")" +
                " OBJTYPE(*ALL)" +
			    " TOLIB(" + newLibName + ")" +
                " NEWOBJ(*OBJ)" + 
				" DATA(" + duplicateData.asData().trimR() + ")";
		commandManager.executeCommandImmediate(job.getJobID(), command, null, true);
	}

	public static enum CREATELIBRARYEnum {
		YES, NO
	}

	public static enum DUPLICATEDATAEnum {
		YES, NO
	}

	public static enum DUPLICATECONSTRAINTSEnum {
		YES, NO
	}

	public static enum DUPLICATETRIGGERSEnum {
		YES, NO
	}

	public static enum DUPLICATEFILEIDENTIFIERSEnum {
		NO, YES
	}
}
