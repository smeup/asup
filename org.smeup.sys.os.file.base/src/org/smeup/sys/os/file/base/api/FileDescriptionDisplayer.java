package org.smeup.sys.os.file.base.api;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;

import javax.inject.Inject;

import org.eclipse.datatools.modelbase.sql.tables.Table;
import org.smeup.sys.db.core.QConnection;
import org.smeup.sys.db.core.QPreparedStatement;
import org.smeup.sys.db.syntax.QDefinitionWriter;
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
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.QExceptionManager;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobLogManager;
import org.smeup.sys.os.file.QDatabaseFile;
import org.smeup.sys.os.file.QDisplayFile;
import org.smeup.sys.os.file.QFile;
import org.smeup.sys.os.file.QFileFormatKey;
import org.smeup.sys.os.file.QFileFormatKeyField;
import org.smeup.sys.os.file.QLogicalFile;
import org.smeup.sys.os.file.QPhysicalFile;
import org.smeup.sys.os.file.QPrinterFile;
import org.smeup.sys.os.file.base.api.FileFinder.FILE;
import org.smeup.sys.os.file.base.api.tools.FileStructureDuplicator;
import org.smeup.sys.os.file.impl.PhysicalFileImpl;
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
	@Inject
	private QDefinitionWriter definitionWriter;

	
	
	public @Main void main(
			@Supported @DataDef(qualified = true) FILE file,
			@Supported @DataDef(dimension = 10, length = 8)  QScroller<QEnum<TYPEOFINFORMATIONEnum, QCharacter>> typeOfInformation,
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
			TYPEOFINFORMATIONEnum informationType = typeOfInformation.get(0).asEnum();
			QFile qFileTo = createDestinationFile(fileFinder, fileToReceiveOutput, informationType);
			writeInfosTo(qFileTo, informationType.assignments(qFile));
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

	private void checkType(QScroller<QEnum<FILEATTRIBUTESEnum, QCharacter>> fileAttributes, QFile file) {
		for (QEnum<FILEATTRIBUTESEnum, QCharacter> attribute : fileAttributes) {
			if (attribute.asEnum().includes(file)) {
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
			@SuppressWarnings({ "serial", "unchecked" })
			@Override
			public LinkedHashMap<String, Object>[] assignments(final QFile fileToDescribe) {
				LinkedHashMap<String, Object>[] result = new LinkedHashMap[1];
				result[0] = new LinkedHashMap<String, Object>() {{
					put("ATRCEN", "1"); //Secolo chiamata
					Date now = new Date();
					DateFormat dayFormatter = new SimpleDateFormat("yyMMdd");
					put("ATRDAT", dayFormatter.format(now));
					SimpleDateFormat hourFormatter = new SimpleDateFormat("hhmmss");
					put("ATRTIM", hourFormatter.format(now));
					put("ATFILE", fileToDescribe.getName());
					put("ATLIB", fileToDescribe.getLibrary());
					FileTypeDescripion typeDescripion = FileTypeDescripion.forType(fileToDescribe);
					put("ATFTYP", typeDescripion.descr1);
					put("ATFILA", typeDescripion.descr2);
					put("ATFATR", typeDescripion.descr3);
					put("ATTXT", fileToDescribe.getText());
					Date creationDate = fileToDescribe.getCreationInfo().getCreationDate();
					put("ATFCDT", dayFormatter.format(creationDate));
					put("ATFCTM", hourFormatter.format(creationDate));
				}};
				return result;
			}
		}, 
		ACCPTH {
			@Override
			public String baseOutputFileName() {
				return "QAFDACCP";
			}
			@SuppressWarnings({ "serial", "unchecked" })
			@Override
			public LinkedHashMap<String, Object>[] assignments(final QFile fileToDescribe) {
				QDatabaseFile databaseFile = (QDatabaseFile) fileToDescribe;
				List<LinkedHashMap<String, Object>> result = new ArrayList<LinkedHashMap<String,Object>>(); 
				final QFileFormatKey key = databaseFile.getDatabaseFormat().getFormatKey();
				int i = 1;
				for (QFileFormatKeyField keyField : key.getKeyFields()) {
					LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
					map.put("APRCEN", "1"); //Secolo chiamata
					Date now = new Date();
					DateFormat dayFormatter = new SimpleDateFormat("yyMMdd");
					map.put("APRDAT", dayFormatter.format(now));
					SimpleDateFormat hourFormatter = new SimpleDateFormat("hhmmss");
					map.put("APRTIM", hourFormatter.format(now));
					map.put("APFILE", fileToDescribe.getName());
					map.put("APLIB", fileToDescribe.getLibrary());
					FileTypeDescripion typeDescripion = FileTypeDescripion.forType(fileToDescribe);
					map.put("APFTYP", typeDescripion.descr1);
					map.put("APFILA", typeDescripion.descr2);
					map.put("APFATR", typeDescripion.descr3);
					//	
					map.put("APUNIQ", key.isUnique() ? "Y" : "N");
					QPhysicalFile referredPF = findPF(fileToDescribe);
					map.put("APBOF", referredPF.getName());
					map.put("APBOL", referredPF.getLibrary());
					map.put("APNKYF", key.getKeyFields().size());
					map.put("APKEYF", keyField.getName());
					map.put("APKSEQ", keyField.isDescend() ? "D" : "A");
					map.put("APKEYN", i++);
						
					result.add(map);
				}

				return result.toArray(new LinkedHashMap[0]);
			}
			@SuppressWarnings("serial")
			private QPhysicalFile findPF(final QFile fileToDescribe) {
				if (fileToDescribe instanceof QPhysicalFile) {
					return (QPhysicalFile) fileToDescribe;
				}
				if (fileToDescribe instanceof QLogicalFile) {
					List<String> tables = ((QLogicalFile) fileToDescribe).getTables();
					final String fileName = tables.get(0);
					return new PhysicalFileImpl(){
						public String getName() {
							return fileName;
						};
						public String getLibrary() {
							return fileToDescribe.getLibrary();
						}
					};
				}
				throw new RuntimeException("Wrong file type for " + fileToDescribe);
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

		public LinkedHashMap<String, Object>[] assignments(QFile fileToDescribe) {
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
	

	private static class FileTypeDescripion {
		public String descr1;
		public String descr2;
		public String descr3;

		public FileTypeDescripion(String descr1, String descr2, String descr3) {
			this.descr1 = descr1;
			this.descr2 = descr2;
			this.descr3 = descr3;
		}
		
		public static FileTypeDescripion forType(QFile fileToDescribe) {
			if (fileToDescribe instanceof QLogicalFile) {
				return new FileTypeDescripion("L", "*LGL", "LF");
			}
			if (fileToDescribe instanceof QPhysicalFile) {
				return new FileTypeDescripion("P", "*PHY", "PF");
			}			
			throw new RuntimeException("Unsupported file type: " + fileToDescribe);
		}
	}
}

