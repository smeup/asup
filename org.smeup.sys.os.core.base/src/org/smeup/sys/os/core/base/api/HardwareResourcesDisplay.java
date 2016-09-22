package org.smeup.sys.os.core.base.api;

import javax.inject.Inject;

import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QEnum;
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

import com.smeup.erp.file.dbf.XX.gen.QARZDPRC;

@Program(name = "QRZDHRRT")
public class HardwareResourcesDisplay {
	public static enum QCPFMSG {
	}
	
	@Inject
	private transient QCommandManager commandManager;
	@Inject
	private transient QJob job;
	@FileDef(userOpen = true, info = "dscons")
	protected transient QRRDataSet<QARZDPRC> qarzdprc;

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
}
