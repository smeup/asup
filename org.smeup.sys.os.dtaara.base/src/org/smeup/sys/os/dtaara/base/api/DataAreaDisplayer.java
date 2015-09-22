package org.smeup.sys.os.dtaara.base.api;

import java.io.IOException;

import javax.inject.Inject;

import org.smeup.sys.dk.core.annotation.Unsupported;
import org.smeup.sys.il.core.out.QObjectWriter;
import org.smeup.sys.il.core.out.QOutputManager;
import org.smeup.sys.il.core.out.QWritableObject;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Entry;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.os.core.QExceptionManager;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.dtaara.QDataArea;
import org.smeup.sys.os.dtaara.QDataAreaManager;
import org.smeup.sys.os.dtaara.base.api.tools.ExistingDataAreaSpecification;
import org.smeup.sys.os.dtaara.base.api.tools.ExistingDataAreaSpecification.DataAreaNotFoundException;
import org.smeup.sys.os.dtaara.base.api.tools.ExistingDataAreaSpecification.LibraryNotFoundException;

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
			@DataDef(qualified = true) QEnum<ExistingDataAreaSpecification.DATAAREAEnum, ExistingDataAreaSpecification> dataAreaSpecification,
			@DataDef(length = 1) QEnum<OUTPUTEnum, QCharacter> output,
			@DataDef(length = 1) QEnum<OUTPUTFORMATEnum, QCharacter> outputFormat,
			@Unsupported @DataDef(length = 1) QEnum<SYSTEMEnum, QCharacter> system) {

		try {
			QDataArea area = dataAreaSpecification.asData().findDataArea(job, resourceManager, dataAreaManager, dataAreaSpecification.asEnum());
			QObjectWriter objectWriter = findOutputWriter(output);
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
		} catch (DataAreaNotFoundException e) {
			e.printStackTrace();
		} catch (LibraryNotFoundException e) {
			e.printStackTrace();
		}
	}

	private QObjectWriter findOutputWriter(QEnum<OUTPUTEnum, QCharacter> output) {
		if (output.asEnum().equals(OUTPUTEnum.PRINT)) {
			return outputManager.getObjectWriter(job.getContext(), "P");
		} else {
			return outputManager.getDefaultWriter(job.getContext());
		}
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
