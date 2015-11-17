package org.smeup.sys.os.file.base.api;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import javax.inject.Inject;

import org.eclipse.datatools.modelbase.sql.tables.Table;
import org.smeup.sys.db.core.QConnection;
import org.smeup.sys.db.core.QPreparedStatement;
import org.smeup.sys.db.core.QStatement;
import org.smeup.sys.db.syntax.QDefinitionWriter;
import org.smeup.sys.dk.core.annotation.Supported;
import org.smeup.sys.dk.core.annotation.Unsupported;
import org.smeup.sys.dk.source.QSourceEntry;
import org.smeup.sys.dk.source.QSourceManager;
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
import org.smeup.sys.os.core.OperatingSystemMessageException;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.QExceptionManager;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobLogManager;
import org.smeup.sys.os.file.QDatabaseFile;
import org.smeup.sys.os.file.QDisplayFile;
import org.smeup.sys.os.file.QFile;
import org.smeup.sys.os.file.QLogicalFile;
import org.smeup.sys.os.file.QPhysicalFile;
import org.smeup.sys.os.file.QPrinterFile;
import org.smeup.sys.os.file.base.api.FileFinder.FILE;
import org.smeup.sys.os.file.base.api.tools.FileStructureDuplicator;
import org.smeup.sys.os.file.base.api.tools.FileStructureDuplicator.LibraryNotFoundException;

@Program(name = "QWHDSPFD")
public @Supported class FileDescriptionDisplayer {
	public static enum QCPFMSG {
		CPF3012,    //File &1 non trovato nella libreria &2.
		CPF3020,    //Nessun file di &1 in &2 ha il FILEATR specificato. 
		CPF3083,    //Il valore &4, specificato nel parametro TYPE, non è  consentito per &3, file &1 nella libreria &2. I tipi *SPOOL, *SELECT e *JOIN non sono consentiti per un file fisico.
		CPF3064,    //Liberia &1 non trovata
		CPF3081,    //Il valore &4 specificato nel parametro TYPE non è consentito per &3, file &1 nella libreria &2    
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
	private QJobLogManager jobLogManager;
	@Inject
	private QDefinitionWriter definitionWriter;
	@Inject
	private QSourceManager sourceManager;
	
	
	public @Main void main(
			@Supported @DataDef(qualified = true) FILE file,
			@Supported @DataDef(dimension = 10, length = 8)  QScroller<QEnum<TypeOfFileInformationEnum, QCharacter>> typeOfInformation,
			@Supported @DataDef(length = 1) QEnum<OUTPUTEnum, QCharacter> output,
			@Supported @DataDef(dimension = 12, length = 5) QScroller<QEnum<FILEATTRIBUTESEnum, QCharacter>> fileAttributes,
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
			TypeOfFileInformationEnum informationType = typeOfInformation.first().asEnum();
			QFile qFileTo = createDestinationFile(fileFinder, fileToReceiveOutput, informationType);
			writeInfosTo(qFileTo, informationType.assignments(new RichQFile(qFile)));
			break;

		case PRINT:
			//TODO
			break;
		case TERM_STAR:
			//TODO			
			break;
		}
	}


	private void writeInfosTo(final QFile qFileTo, final LinkedHashMap<String, Object> assignments[]) {
		QConnection connection = job.getContext().getAdapter(job, QConnection.class);
		Table tableTo = connection.getCatalogMetaData().getTable(qFileTo.getLibrary(), qFileTo.getName());
		String sqlInsert = definitionWriter.insertData(tableTo, new ArrayList<String>(assignments[0].keySet()));
		try (QPreparedStatement stmt = connection.prepareStatement(sqlInsert);) {
			for (LinkedHashMap<String, Object> assignment : assignments) {
				int i = 1;
				for (Object value: assignment.values()) {
					stmt.setObject(i++, value);
				}
				stmt.execute();				
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new OperatingSystemRuntimeException(e);
		}
	}

	private QFile createDestinationFile(FileFinder fileFinder, 
										FILE toFile, 
										TypeOfFileInformationEnum typeofinformationEnum) {
		QResourceWriter<QFile> fileWriter = fileFinder.writerFor(toFile.library);
		String toFileName = toFile.nameGeneric.trimR();
		QFile qFileTo = fileWriter.lookup(toFileName);
		if(qFileTo == null) {
			QFile qFileFrom = fileFinder.lookup(typeofinformationEnum.baseOutputFileName(), "QSYS");
			try {
				qFileTo = new FileStructureDuplicator(job, jobLogManager).createFile(qFileFrom, toFileName, fileWriter);
			} catch (LibraryNotFoundException e) {
				throw exceptionManager.prepareException(job, QCPFMSG.CPF3064, toFile.library.asData().trimR());
			}
		}	
		return qFileTo;
	}

	private void checkType(QScroller<QEnum<FILEATTRIBUTESEnum, QCharacter>> fileAttributes, QFile file) {
		for (QEnum<FILEATTRIBUTESEnum, QCharacter> attribute : fileAttributes) {
			if (attribute.asEnum().includes(file)) {
				return;
			}
		}
		
		throw exceptionManager.prepareException(job, QCPFMSG.CPF3020, new String[] {file.getName(), file.getLibrary()});				
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
	

	public class RichQFile {
		public final QFile qFile;

		public RichQFile(QFile qFile) {
			this.qFile = qFile;
		}
		
		public OperatingSystemMessageException createException(QCPFMSG cpf, String[] variables) {
			return exceptionManager.prepareException(job, cpf, variables);
		}

		public List<QSourceEntry> getMembers() {
			QSourceEntry sourceEntry = sourceManager.getObjectEntry(job.getContext(), qFile.getLibrary(), QFile.class, qFile.getName());
			return sourceManager.listChildEntries(job.getContext(), sourceEntry);
		}

		public int countRecords() {
			QConnection connection = job.getContext().getAdapter(job, QConnection.class);
			Table table = connection.getCatalogMetaData().getTable(qFile.getLibrary(), qFile.getName());

			try (QStatement statement = connection.createStatement(true); 
 				ResultSet resultSet = statement.executeQuery(definitionWriter.countRecords(table))) {
				if (resultSet.next()) {
					return resultSet.getInt(1);
				} else {
					return 0;
				}
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}

		public QDatabaseFile findFile(String table) {
			return (QDatabaseFile)new FileFinder(job, resourceManager).lookup(table, this.qFile.getLibrary());			
		}
	}
	
}

