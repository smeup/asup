package org.smeup.sys.os.core.base.api;

import javax.inject.Inject;

import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QDecimal;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.QRecordWrapper;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.il.esam.QRRDataSet;
import org.smeup.sys.il.esam.annotation.FileDef;
import org.smeup.sys.os.cmd.QCallableCommand;
import org.smeup.sys.os.cmd.QCommandManager;
import org.smeup.sys.os.core.OperatingSystemMessageException;
import org.smeup.sys.os.core.jobs.QJob;

@Program(name = "QRZDHRRT")
public class HardwareResourcesDisplay {
	public static enum QCPFMSG {
	}
	
	@Inject
	private transient QCommandManager commandManager;
	@Inject
	private transient QJob job;
//	@FileDef(userOpen = true, info = "dscons", externalFile="sysFile")
	@FileDef(userOpen = true, externalFile="sysFile")
	protected transient QRRDataSet<QARZDPRC> qarzdprc;
	@DataDef(length = 21)
	private QCharacter sysFile;

	@Main
	public void main(@DataDef(length = 4) QEnum<TYPEEnum, 
			QCharacter> type, @DataDef(length = 1) QEnum<OUTPUTEnum, 
			QCharacter> output,
			@DataDef(qualified = true) FILETORECEIVEOUTPUT fileToReceiveOutput, 
			OUTPUTMEMBEROPTIONS outputMemberOptions, 
			@DataDef(length = 1) QEnum<OUTFILEFORMATEnum, 
			QCharacter> outfileFormat,
			@DataDef(length = 4) QEnum<LINETYPEEnum, 
			QCharacter> lineType) {
		
		
		switch(output.asEnum()){
		case OUTFILE:
			String command = "";
			boolean checkOk = true;
			
			// Esistenza file 
			command = "CHKOBJ OBJ(" + fileToReceiveOutput.library.asData().trimR() + "/" + fileToReceiveOutput.name.trimR() + ") OBJTYPE(*FILE)";
			try{
				QCallableCommand callableCommand = commandManager.prepareCommand(job, command, null, true);		
				commandManager.executeCommand(job, callableCommand);
				callableCommand.close();
			} catch (final OperatingSystemMessageException e3) {
				switch (e3.getMessageName()) {
				case "CPF9801": {
					checkOk = false;
				}
				}
			}

			// Creazione
			if(!checkOk){
				command = "CRTDUPOBJ OBJ(" + fileToReceiveOutput.name.trimR() + ") FROMLIB(*LIBL) OBJTYPE(*FILE) TOLIB(" + fileToReceiveOutput.library.asData().trimR() + ") DATA(*NO)";
				QCallableCommand callableCommand = commandManager.prepareCommand(job, command, null, true);		
				commandManager.executeCommand(job, callableCommand);
				callableCommand.close();
			}
			
			// Pulizia 
			command = "CLRPFM FILE(" + fileToReceiveOutput.library.asData().trimR() + "/" + fileToReceiveOutput.name.trimR() + ") OBJTYPE(*FILE)";;
			QCallableCommand callableCommand = commandManager.prepareCommand(job, command, null, true);		
			commandManager.executeCommand(job, callableCommand);
			callableCommand.close();
			
			// Scrittura (TODO)
			sysFile.eval(fileToReceiveOutput.library.asData().trimR() + "/" + fileToReceiveOutput.name.trimR());
			qarzdprc.open();
			qarzdprc.clear();
			qarzdprc.get().posnam.eval(job.getSystem().getName());
			qarzdprc.write();
			qarzdprc.close();
			
			break;
		case PRINT:
			break;
		case TERM_STAR:
			break;
		}
		
	}

	public static enum TYPEEnum {
		AHW, CMN, CRP, CSA, LAN, LWS, PRC, STG
	}

	public static enum OUTPUTEnum {
		@Special(value = "*") TERM_STAR, @Special(value = "P") PRINT, @Special(value = "O") OUTFILE
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
		@DataDef(length = 7, value = "*REPLACE")
		public QEnum<REPLACEORADDRECORDSEnum, QCharacter> replaceOrAddRecords;

		public static enum MEMBERTORECEIVEOUTPUTEnum {
			FIRST, OTHER
		}

		public static enum REPLACEORADDRECORDSEnum {
			@Special(value = "REPLACE") REPLACE, @Special(value = "ADD") ADD
		}
	}

	public static enum OUTFILEFORMATEnum {
		@Special(value = "E") TYPE1, @Special(value = "A") TYPE2
	}

	public static enum LINETYPEEnum {
		ALL, DDI, TRN
	}
	
	public static class QARZDPRC extends QRecordWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 1)
		public QCharacter porcen;
		@DataDef(length = 6)
		public QCharacter pordat;
		@DataDef(length = 6)
		public QCharacter portim;
		@DataDef(length = 8)
		public QCharacter posnam;
		@DataDef(length = 4)
		public QCharacter postyp;
		@DataDef(length = 3)
		public QCharacter posmod;
		@DataDef(length = 10)
		public QCharacter posser;
		@DataDef(length = 1)
		public QCharacter porecf;
		@DataDef(length = 6)
		public QCharacter posvrm;
		@DataDef(length = 36)
		public QCharacter porsvd;
		@DataDef(length = 2)
		public QCharacter porsvf;
		@DataDef(length = 1)
		public QCharacter pocrpf;
		@DataDef(length = 1)
		public QCharacter pocsaf;
		@DataDef(length = 1)
		public QCharacter pocmnf;
		@DataDef(length = 1)
		public QCharacter polwsf;
		@DataDef(length = 1)
		public QCharacter postgf;
		@DataDef(length = 1)
		public QCharacter poprcf;
		@DataDef(length = 1)
		public QCharacter porlvl;
		@DataDef(length = 2)
		public QCharacter pordsc;
		@DataDef(length = 10)
		public QCharacter pornam;
		@DataDef(length = 10)
		public QCharacter porpar;
		@DataDef(length = 4)
		public QCharacter portyp;
		@DataDef(length = 3)
		public QCharacter pormod;
		@DataDef(length = 12)
		public QCharacter porprt;
		@DataDef(length = 10)
		public QCharacter porser;
		@DataDef(length = 1)
		public QCharacter porsts;
		@DataDef(length = 2)
		public QCharacter porrid;
		@DataDef(length = 2)
		public QCharacter poreia;
		@DataDef(length = 3)
		public QCharacter porcsl;
		@DataDef(length = 2)
		public QCharacter poruni;
		@DataDef(length = 3)
		public QCharacter pordsl;
		@DataDef(length = 3)
		public QCharacter porcps;
		@DataDef(precision = 10, packed = true)
		public QDecimal pormsz;
		@DataDef(length = 4)
		public QCharacter porafi;
		@DataDef(length = 5)
		public QCharacter poracp;
		@DataDef(length = 4)
		public QCharacter prcfcd;
		@DataDef(length = 4)
		public QCharacter prcfd;
		@DataDef(length = 4)
		public QCharacter prcifd;
		@DataDef(length = 79)
		public QCharacter loccod;
		@DataDef(length = 1)
		public QCharacter swtmod;
		@DataDef(length = 15)
		public QCharacter poexsn;
	}	
	
}
