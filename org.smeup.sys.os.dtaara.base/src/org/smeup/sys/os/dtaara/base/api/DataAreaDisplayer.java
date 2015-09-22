package org.smeup.sys.os.dtaara.base.api;

import java.io.IOException;

import javax.inject.Inject;

import org.smeup.sys.dk.core.annotation.Unsupported;
import org.smeup.sys.il.core.out.QObjectWriter;
import org.smeup.sys.il.core.out.QOutputManager;
import org.smeup.sys.il.core.out.QWritableObject;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Entry;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.il.memo.QResourceSetReader;
import org.smeup.sys.il.memo.Scope;
import org.smeup.sys.os.core.QExceptionManager;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.dtaara.QDataArea;
import org.smeup.sys.os.dtaara.QDataAreaManager;
import org.smeup.sys.os.lib.QLibrary;

@Program(name = "QWCCDSVC")
public class DataAreaDisplayer {
	public static enum QCPFMSG {
		CPF1015,    //Non è stata trovata l'area dati &1 in &2.                 
		CPF1021,    //Non è stata trovata la libreria &1 per l'area dati &2.    
		CPF1046,    //DTAARA(*GDA) non è valido perché il lavoro non è un lavoro di gruppo.                                         
		CPF9871     //Si è verificato un errore durante l'elaborazione.
	}

	
	@Inject
	private QOutputManager outputManager;
	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QJob job;
	@Inject
	private QDataAreaManager dataAreaManager;
	@Inject
	private QExceptionManager exceptionManager;
	
	
	public @Entry void main(
			@DataDef(qualified = true) QEnum<DATAAREAEnum, DATAAREA> dataAreaSpecification,
			@DataDef(length = 1) QEnum<OUTPUTEnum, QCharacter> output,
			@DataDef(length = 1) QEnum<OUTPUTFORMATEnum, QCharacter> outputFormat,
			@Unsupported @DataDef(length = 1) QEnum<SYSTEMEnum, QCharacter> system) {
		QDataArea area = findDataArea(dataAreaSpecification);
		QObjectWriter objectWriter = findWriter(output);
		try {
			objectWriter.initialize();
			objectWriter.write(area);
			objectWriter.flush();
			
			String label = "Data area";
			QWritableObject objectToWrite = outputManager.getWritableObject(label, Math.max(label.length(), area.getContentLength()));
			objectToWrite.setObject(area.getContent());

			objectWriter.initialize();
			objectWriter.write(objectToWrite.getObjectToWrite());
			objectWriter.flush();
		} catch (IOException e) {
			throw exceptionManager.prepareException(job, QCPFMSG.CPF9871, new String[0]);	
		}
	}

	private QObjectWriter findWriter(QEnum<OUTPUTEnum, QCharacter> output) {
		if (output.asEnum().equals(OUTPUTEnum.PRINT)) {
			return outputManager.getObjectWriter(job.getContext(), "P");
		} else {
			return outputManager.getDefaultWriter(job.getContext());
		}
	}

	private QResourceReader<QDataArea> findReader(DATAAREA object) {
		QResourceReader<QDataArea> resourceReader = null;
		switch (object.library.asEnum()) {
		case CURLIB:
			resourceReader = resourceManager.getResourceReader(job, QDataArea.class, Scope.CURRENT_LIBRARY);
			break;
		case LIBL:
			resourceReader = resourceManager.getResourceReader(job, QDataArea.class, Scope.LIBRARY_LIST);
			break;
		case OTHER:
			String libraryName = object.library.asData().trimR();
			checkLibrary(libraryName, object.name.trimR());
			resourceReader = resourceManager.getResourceReader(job, QDataArea.class, libraryName);
			break;
		}
		return resourceReader;
	}
	
	private QDataArea findDataArea(QEnum<DATAAREAEnum, DATAAREA> dataAreaSpecification) {
		DATAAREAEnum dataAreaType = dataAreaSpecification.asEnum();
		switch(dataAreaType) {
		case LDA:
			return dataAreaManager.getLocalDataArea(job.getContext());
		case OTHER:
			String dataAreaName = dataAreaSpecification.asData().name.trimR();
			String libraryName = dataAreaSpecification.asData().library.asData().trimR();
			QDataArea result = findReader(dataAreaSpecification.asData()).lookup(dataAreaName);
			if (result == null) {
				throw exceptionManager.prepareException(job, QCPFMSG.CPF1015, new String[] {libraryName, dataAreaName});				
			}
			return result;
		default:
			throw new UnsupportedOperationException("Unsupported DTAARA Type: " + dataAreaType);
		}
	}
	
	private void checkLibrary(String libraryName, String dataAreaName) {
		QResourceSetReader<QLibrary> resourceReader = resourceManager.getResourceReader(job, QLibrary.class, Scope.ALL);
		if (!resourceReader.exists(libraryName)) {
			throw exceptionManager.prepareException(job, QCPFMSG.CPF1021, new String[] {libraryName, dataAreaName});
		}
	}

	public static class DATAAREA extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		
		@DataDef(length = 10)
		public QCharacter name;
		
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<LIBRARYEnum, QCharacter> library;

		public static enum LIBRARYEnum {
			LIBL, CURLIB, OTHER
		}
	}

	public static enum DATAAREAEnum {
		LDA, GDA, PDA, OTHER
	}

	public static enum OUTPUTEnum {
		@Special(value = "*")
		TERM_STAR, 
		
		@Special(value = "L")
		PRINT
	}

	public static enum OUTPUTFORMATEnum {
		@Special(value = "C")
		CHAR,
		
		@Special(value = "H")
		HEX
	}

	public static enum SYSTEMEnum {
		@Special(value = "L")
		LCL,
		
		@Special(value = "R")
		RMT
	}
}
