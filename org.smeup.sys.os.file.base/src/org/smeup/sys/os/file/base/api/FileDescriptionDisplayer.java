package org.smeup.sys.os.file.base.api;

import javax.inject.Inject;

import org.smeup.sys.dk.core.annotation.Supported;
import org.smeup.sys.dk.core.annotation.ToDo;
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
import org.smeup.sys.os.core.QExceptionManager;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.file.QFile;
import org.smeup.sys.os.file.base.api.FileFinder.FILE;

@Program(name = "QWHDSPFD")
public @Supported class FileDescriptionDisplayer {
	public static enum QCPFMSG {
		CPF3012     //File &1 non trovato nella libreria &2.
	}

	@Inject
	private QOutputManager outputManager;
	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QJob job;
	@Inject
	private QExceptionManager exceptionManager;

	
	
	public @Main void main(
			@Supported @DataDef(qualified = true) FILE file,
			@ToDo @DataDef(dimension = 10, length = 8) QEnum<TYPEOFINFORMATIONEnum, QScroller<QCharacter>> typeOfInformation,
			@ToDo @DataDef(length = 1) QEnum<OUTPUTEnum, QCharacter> output,
			@ToDo @DataDef(dimension = 12, length = 5) QEnum<FILEATTRIBUTESEnum, QScroller<QCharacter>> fileAttributes,
			@ToDo @DataDef(qualified = true) FILETORECEIVEOUTPUT fileToReceiveOutput,
			@ToDo OUTPUTMEMBEROPTIONS outputMemberOptions,
			@ToDo @DataDef(length = 1) QEnum<SYSTEMEnum, QCharacter> system) {

		FileFinder fileFinder = new FileFinder(job, resourceManager);
		QFile qFile = fileFinder.lookup(file);
		
		if(qFile == null)
			throw exceptionManager.prepareException(job, QCPFMSG.CPF3012, new String[] {file.nameGeneric.trimR(), file.library.asData().trimR()});		

	}

	public static enum TYPEOFINFORMATIONEnum {
		ALL, BASATR, ATR, ACCPTH, MBRLIST, SELECT, SEQ, RCDFMT, MBR, SPOOL, JOIN, TRG, CST, NODGRP
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
		ALL, DSPF, PRTF, DKTF, TAPF, CMNF, BSCF, MXDF, PF, LF, SAVF, DDMF, ICFF
	}

	public static class FILETORECEIVEOUTPUT extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter name;
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<LIBRARYEnum, QCharacter> library;

		public static enum LIBRARYEnum {
			LIBL, CURLIB, OTHER
		}
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
			REPLACE, @Special(value = "A")
			ADD
		}
	}

	public static enum SYSTEMEnum {
		@Special(value = "L")
		LCL, @Special(value = "R")
		RMT, @Special(value = "A")
		ALL
	}
}
