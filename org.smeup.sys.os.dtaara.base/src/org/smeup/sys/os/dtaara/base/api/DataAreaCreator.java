package org.smeup.sys.os.dtaara.base.api;

import java.util.Arrays;

import javax.inject.Inject;

import org.smeup.sys.dk.core.annotation.ToDo;
import org.smeup.sys.dk.core.annotation.Unsupported;
import org.smeup.sys.il.core.java.QStrings;
import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Entry;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.il.data.def.BinaryType;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceSetReader;
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.il.memo.Scope;
import org.smeup.sys.os.core.QExceptionManager;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.dtaara.DataAreaType;
import org.smeup.sys.os.dtaara.QDataArea;
import org.smeup.sys.os.dtaara.QOperatingSystemDataAreaFactory;
import org.smeup.sys.os.lib.QLibrary;

@Program(name = "QWCCCRVC")
public class DataAreaCreator {
	public static enum QCPFMSG {
		CPF1021, //Non è stata trovata la libreria &1 per l'area dati &2
		CPF1023, //L'area dati &1 esiste in &2
		CPF1024, //I parametri TYPE e VALUE non sono compatibili.         
		CPF1025, //I parametri LEN e VALUE non sono compatibili.          
		CPF1026, //Il parametro VALUE deve essere '0' o '1'.              
		CPF1047, //La lunghezza non è valida per l'area dati &1 in &2.    
		CPF1062, //La stringa nulla non è valida come valore di caratteri.
	}

	@Inject
	private QExceptionManager exceptionManager;
	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QJob job;
	@Inject
	private QOperatingSystemDataAreaFactory dataAreaFactory;
	@Inject
	QStrings strings;
	
	private QResourceWriter<QDataArea> resourceWriter;
	

	public @Entry void main(
			@DataDef(qualified = true) QEnum<DATAAREAEnum, DATAAREA> dataArea,
			@DataDef(length = 1) QEnum<TIPOEnum, QCharacter> tipo,
			@DataDef(length = 1) LUNGHEZZA lunghezza,
			@DataDef(length = 2000) QCharacter valoreIniziale,
			@Unsupported @DataDef(qualified = true) AREADATIREMOTA areaDatiRemota,
			@Unsupported @DataDef(length = 8) QEnum<UBICAZIONEREMOTAEnum, QCharacter> ubicazioneRemota,
			@Unsupported @DataDef(length = 18) QCharacter databaseRelazionale,
			@Unsupported @DataDef(length = 10) QEnum<DESCRIZIONEUNITAAPPCEnum, QCharacter> descrizioneUnitaAPPC,
			@Unsupported @DataDef(length = 8) QEnum<UBICAZIONELOCALEEnum, QCharacter> ubicazioneLocale,
			@Unsupported @DataDef(length = 8) QEnum<MODALITAEnum, QCharacter> modalita,
			@Unsupported @DataDef(length = 8) QEnum<RETEREMOTAEnum, QCharacter> reteRemota,
			@DataDef(length = 50) QEnum<DESCRIZIONETESTOEnum, QCharacter> descrizioneTesto,
			@ToDo @DataDef(length = 10) QEnum<AUTORIZZAZIONEEnum, QCharacter> autorizzazione) {
		
		String areaName = dataArea.asData().name.trimR();
		String libName = dataArea.asData().library.asData().trimR();
		switch (dataArea.asData().library.asEnum()) {
		case CURLIB:
			resourceWriter = resourceManager.getResourceWriter(job, QDataArea.class, Scope.CURRENT_LIBRARY);
			libName = resourceWriter.getName();
			break;
		case OTHER:
			resourceWriter = resourceManager.getResourceWriter(job, QDataArea.class, libName);
			break;
		}
		
		checkLibrary(libName, areaName);
		checkExistence(areaName, libName);
		
		
		QDataArea newDataArea = dataAreaFactory.createDataArea();
		setValue(tipo.asEnum().dataAreaType, lunghezza, valoreIniziale, newDataArea);
		newDataArea.setName(areaName);
		newDataArea.setLibrary(libName);
		newDataArea.setDataAreaType(tipo.asEnum().dataAreaType);
		newDataArea.setText(descriptionFrom(descrizioneTesto));
		
		resourceWriter.save(newDataArea);
	}

	private String descriptionFrom(QEnum<DESCRIZIONETESTOEnum, QCharacter> descrizioneTesto) {
		switch (descrizioneTesto.asEnum()) {
		case BLANK:
			return "";
		case OTHER:
			return  descrizioneTesto.asData().trimR();
		}
		return "";
	}

	private void setValue(DataAreaType tipo, LUNGHEZZA lunghezza, QCharacter valoreIniziale, QDataArea newDataArea) {
		String valore = valoreIniziale.trimR();
		if (strings.isEmptyTrim(valore)) {
			return;
		}
		switch (tipo) {
		case CHARACTER:
			if (valore.length() > lunghezza.lunghezza.asInteger()) {
				throw exceptionManager.prepareException(job, QCPFMSG.CPF1023, new String[0]);
			}
			newDataArea.setContent(valore);
			break;
		
		case LOGICAL:
			if (!strings.isOneOf(valore, Arrays.asList("1", "0"))) {
				throw exceptionManager.prepareException(job, QCPFMSG.CPF1024, new String[0]);
			}
			newDataArea.setContentDecimal(Integer.parseInt(valore));
			break;
		
		case DECIMAL:
			throw new UnsupportedOperationException("TODO");
//********* TODO ***************
//			break;
		
		case DISTRIBUTED:
			throw new UnsupportedOperationException("Unsupported data area type: DDM");
		}
	}

	private void checkExistence(String areaName, String libName) {
		if (resourceWriter.exists(areaName)) {
			throw exceptionManager.prepareException(job, QCPFMSG.CPF1023, new String[] {areaName, libName});
		}
	}

	private void checkLibrary(String libName, String areaName) {
		QResourceSetReader<QLibrary> resourceReader = resourceManager.getResourceReader(job, QLibrary.class, Scope.ALL);
		if (!resourceReader.exists(libName)) {
			throw exceptionManager.prepareException(job, QCPFMSG.CPF1021, new String[] {libName, areaName});
		}
	}


	public static class DATAAREA extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		
		@DataDef(length = 10)
		public QCharacter name;
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<LIBRARYEnum, QCharacter> library;

		public static enum LIBRARYEnum {
			CURLIB, OTHER
		}
	}

	public static enum DATAAREAEnum {
		LDA, GDA, PDA, OTHER
	}

	public static enum TIPOEnum {
				
		@Special(value = "D")
		DEC(DataAreaType.DECIMAL),
		
		@Special(value = "C")
		CHAR(DataAreaType.CHARACTER),
		
		@Special(value = "L")
		LGL(DataAreaType.LOGICAL), 
				
		@Special(value = "R")
		DDM(DataAreaType.DISTRIBUTED);
		
		public final DataAreaType dataAreaType;
		
		TIPOEnum (DataAreaType dataAreaType) {
			this.dataAreaType = dataAreaType;
		}
	}

	public static class LUNGHEZZA extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		
		@DataDef(binaryType = BinaryType.SHORT)
		public QBinary lunghezza;
		
		@DataDef(binaryType = BinaryType.SHORT)
		public QBinary posizioniDecimali;
	}

	public static class AREADATIREMOTA extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		
		@DataDef(length = 10)
		public QCharacter nome;
		
		@DataDef(length = 10)
		public QEnum<LIBRERIAEnum, QCharacter> libreria;

		public static enum LIBRERIAEnum {
			LIBL, CURLIB, OTHER
		}
	}

	public static enum UBICAZIONEREMOTAEnum {
		RDB, OTHER
	}

	public static enum DESCRIZIONEUNITAAPPCEnum {
		LOC, OTHER
	}

	public static enum UBICAZIONELOCALEEnum {
		LOC, NETATR, OTHER
	}

	public static enum MODALITAEnum {
		NETATR, OTHER
	}

	public static enum RETEREMOTAEnum {
		LOC, NETATR, NONE, OTHER
	}

	public static enum DESCRIZIONETESTOEnum {
		@Special(value = "")
		BLANK, 
		OTHER
	}

	public static enum AUTORIZZAZIONEEnum {
		LIBCRTAUT, CHANGE, ALL, USE, EXCLUDE, OTHER
	}
}
