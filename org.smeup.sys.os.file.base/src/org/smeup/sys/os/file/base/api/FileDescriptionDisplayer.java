package org.smeup.sys.os.file.base.api;

import javax.inject.Inject;

import org.smeup.sys.db.core.QTableColumnDef;
import org.smeup.sys.db.core.QTableDef;
import org.smeup.sys.dk.core.annotation.Supported;
import org.smeup.sys.dk.core.annotation.Unsupported;
import org.smeup.sys.il.core.java.QStrings;
import org.smeup.sys.il.core.out.QOutputManager;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.QScroller;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.os.core.QExceptionManager;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobLogManager;
import org.smeup.sys.os.file.QDisplayFile;
import org.smeup.sys.os.file.QFile;
import org.smeup.sys.os.file.QFileManager;
import org.smeup.sys.os.file.QLogicalFile;
import org.smeup.sys.os.file.QPhysicalFile;
import org.smeup.sys.os.file.QPrinterFile;
import org.smeup.sys.os.file.base.api.FileFinder.FILE;
import org.smeup.sys.os.file.base.api.tools.FileStructureDuplicator;
import org.smeup.sys.rt.core.QApplication;

@Program(name = "QWHDSPFD")
public @Supported class FileDescriptionDisplayer {
	public static enum QCPFMSG {
		CPF3012,    //File &1 non trovato nella libreria &2.
		CPF3020     //Nessun file di &1 in &2 ha il FILEATR specificato. 
	}

	@Inject
	private QOutputManager outputManager;
	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QJob job;
	@Inject
	private QExceptionManager exceptionManager;
	@Inject
	private QStrings stringUtils;
	@Inject
	private QJobLogManager jobLogManager;
	@Inject
	private QApplication application;

	
	
	public @Main void main(
			@Supported @DataDef(qualified = true) FILE file,
			@Supported @DataDef(dimension = 10, length = 8) QScroller<QCharacter> typeOfInformation,
			@Supported @DataDef(length = 1) QEnum<OUTPUTEnum, QCharacter> output,
			@Supported @DataDef(dimension = 12, length = 5) QScroller<QCharacter> fileAttributes,
			@Supported @DataDef(qualified = true) FILE fileToReceiveOutput,
			@Unsupported OUTPUTMEMBEROPTIONS outputMemberOptions,
			@Unsupported @DataDef(length = 1) QEnum<SYSTEMEnum, QCharacter> system) {

		FileFinder fileFinder = new FileFinder(job, resourceManager);
		QFile qFile = fileFinder.lookup(file);
		
		if(qFile == null)
			throw exceptionManager.prepareException(job, QCPFMSG.CPF3012, new String[] {file.nameGeneric.trimR(), file.library.asData().trimR()});		

		checkType(fileAttributes, qFile);
		
		switch (output.asEnum()) {
		case OUTFILE:
			TYPEOFINFORMATIONEnum informationType = TYPEOFINFORMATIONEnum.valueOf(stringUtils.removeFirstChar(typeOfInformation.first().trimR()));
			QFile qFileTo = createDestinationFile(fileFinder, fileToReceiveOutput, informationType);
			informationType.writeTo(application, qFile, qFileTo);
			break;

		case PRINT:
			
			break;
		case TERM_STAR:
			
			break;
		}
	}

	private QFile createDestinationFile(FileFinder fileFinder, 
										FILE toFile, 
										TYPEOFINFORMATIONEnum typeofinformationEnum) {
		QResourceWriter<QFile> fileWriter = fileFinder.writerFor(toFile.library);
		String toFileName = toFile.nameGeneric.trimR();
		QFile qFileTo = fileWriter.lookup(toFileName);
		if(qFileTo == null) {
			QFile qFileFrom = fileFinder.lookup(typeofinformationEnum.baseOutputFileName(), "QSYS");
			qFileTo = new FileStructureDuplicator(job, jobLogManager).createFile(qFileFrom, toFileName, fileWriter);
		}	
		return qFileTo;
	}


	
	private void checkType(QScroller<QCharacter> fileAttributes, QFile file) {
		for (QCharacter attribute : fileAttributes) {
			String attributeName = stringUtils.removeFirstChar(attribute.trimR());
			if (!stringUtils.isEmptyTrim(attributeName) && FILEATTRIBUTESEnum.valueOf(attributeName).includes(file)) {
				return;
			}
		}
		
		throw exceptionManager.prepareException(job, QCPFMSG.CPF3020, new String[] {file.getName(), file.getLibrary()});				
	}

	public static enum TYPEOFINFORMATIONEnum {
		ALL,  
		BASATR {
			@Override
			public String baseOutputFileName() {
				return "QAFDBASI";
			}
			@Override
			public void writeTo(QApplication application, QFile fileToDescribe, QFile destinationFile) {
				QTableDef destinationTable = application.getContext().getAdapter(destinationFile, QTableDef.class);
				System.out.println(destinationTable);
			}		
		}, 
		ACCPTH {
			@Override
			public String baseOutputFileName() {
				return "QAFDACCP";
			}
		}, 
		MBRLIST {
			@Override
			public String baseOutputFileName() {
				return "QAFDMBRL";
			}
		}, 
		SELECT {
			@Override
			public String baseOutputFileName() {
				return "QAFDSELO";
			}
		}, 
		SEQ, 
		RCDFMT {
			@Override
			public String baseOutputFileName() {
				return "QAFDRFMT";
			}
		}, 
		MBR{
			@Override
			public String baseOutputFileName() {
				return "QAFDMBR";
			}
		}, 
		ATR, SPOOL, JOIN, TRG, CST, NODGRP;
		public String baseOutputFileName() {
			throw new RuntimeException("Unsupported information type " + this.name());			
		}

		public void writeTo(QApplication application, QFile fileToDescribe, QFile destinationFile) {
			throw new RuntimeException("Unsupported information type " + this.name());	
		}
	}

	public static enum OUTPUTEnum {
		@Special(value = "*")
		TERM_STAR, 
		@Special(value = "L")
		PRINT, 
		@Special(value = "N")
		OUTFILE
	}

	public static enum FILEATTRIBUTESEnum {
		ALL {
			@Override
			public boolean includes(QFile arg0) {
				return true;
			}
		}, 
		DSPF {
			@Override
			public boolean includes(QFile file) {
				return file instanceof QDisplayFile;
			}
		}, 
		PRTF {
			@Override
			public boolean includes(QFile file) {
				return file instanceof QPrinterFile;
			}
		}, 
		PF  {
			@Override
			public boolean includes(QFile file) {
				return file instanceof QPhysicalFile;
			}
		},	
		LF {
			@Override
			public boolean includes(QFile file) {
				return file instanceof QLogicalFile;
			}
		},
		DKTF, TAPF,	CMNF, BSCF, MXDF,SAVF, DDMF, ICFF; 

		public boolean includes(QFile file) {
			throw new RuntimeException("Unsupported type " + this.name());
		};
	}


	public static class OUTPUTMEMBEROPTIONS extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		
		@DataDef(length = 10, value = "*FIRST")
		public QEnum<MEMBERTORECEIVEOUTPUTEnum, QCharacter> memberToReceiveOutput;
		
		@DataDef(length = 1, value = "*REPLACE")
		public QEnum<REPLACEORADDRECORDSEnum, QCharacter> replaceOrAddRecords;

		public static enum MEMBERTORECEIVEOUTPUTEnum {
			FIRST, OTHER
		}

		public static enum REPLACEORADDRECORDSEnum {
			@Special(value = "R")
			REPLACE, 
			@Special(value = "A")
			ADD
		}
	}

	public static enum SYSTEMEnum {
		@Special(value = "L")
		LCL,
		@Special(value = "R")
		RMT, 
		@Special(value = "A")
		ALL
	}
}
