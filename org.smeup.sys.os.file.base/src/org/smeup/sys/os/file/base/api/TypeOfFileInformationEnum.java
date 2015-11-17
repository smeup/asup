package org.smeup.sys.os.file.base.api;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;

import org.smeup.sys.dk.source.QSourceEntry;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.file.QDatabaseFile;
import org.smeup.sys.os.file.QDatabaseFileFormat;
import org.smeup.sys.os.file.QDisplayFile;
import org.smeup.sys.os.file.QFile;
import org.smeup.sys.os.file.QFileFormat;
import org.smeup.sys.os.file.QFileFormatKey;
import org.smeup.sys.os.file.QFileFormatKeyField;
import org.smeup.sys.os.file.QLogicalFile;
import org.smeup.sys.os.file.QPhysicalFile;
import org.smeup.sys.os.file.QPrinterFile;
import org.smeup.sys.os.file.QSourceFile;
import org.smeup.sys.os.file.base.api.FileDescriptionDisplayer.QCPFMSG;
import org.smeup.sys.os.file.impl.PhysicalFileImpl;

public enum TypeOfFileInformationEnum {
	ALL,  
	BASATR {
		@Override
		public String baseOutputFileName() {
			return "QAFDBASI";
		}
		@SuppressWarnings({"unchecked" })
		@Override
		public LinkedHashMap<String, Object>[] assignments(final FileDescriptionDisplayer.RichQFile fileToDescribe) {
			LinkedHashMap<String, Object>[] result = new LinkedHashMap[1];
			result[0] = new LinkedHashMap<String, Object>();
			addDefaultData("AT", result[0], fileToDescribe.qFile);
			//
			result[0].put("ATTXT", fileToDescribe.qFile.getText());
			Date creationDate = fileToDescribe.qFile.getCreationInfo().getCreationDate();
			result[0].put("ATFCCN", 1);
			DateFormat dayFormatter = new SimpleDateFormat("yyMMdd");
			result[0].put("ATFCDT", dayFormatter.format(creationDate));
			SimpleDateFormat hourFormatter = new SimpleDateFormat("hhmmss");
			result[0].put("ATFCTM", hourFormatter.format(creationDate));
			return result;
		}
	}, 
	ACCPTH {
		@Override
		public String baseOutputFileName() {
			return "QAFDACCP";
		}
		@SuppressWarnings({"unchecked" })
		@Override
		public LinkedHashMap<String, Object>[] assignments(final FileDescriptionDisplayer.RichQFile fileToDescribe) {
			QDatabaseFile databaseFile = (QDatabaseFile) fileToDescribe;
			List<LinkedHashMap<String, Object>> result = new ArrayList<LinkedHashMap<String,Object>>(); 
			final QFileFormatKey key = databaseFile.getDatabaseFormat().getFormatKey();
			int i = 1;
			for (QFileFormatKeyField keyField : key.getKeyFields()) {
				LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
				addDefaultData("AP", map, fileToDescribe.qFile);
				//	
				map.put("APUNIQ", key.isUnique() ? "Y" : "N");
				QPhysicalFile referredPF = findPF(fileToDescribe.qFile);
				map.put("APBOF", referredPF.getName());
				map.put("APBOL", referredPF.getLibrary());
				map.put("APNKYF", key.getKeyFields().size());
				map.put("APKEYF", keyField.getName());
				map.put("APKSEQ", keyField.isDescend() ? "D" : "A");
				map.put("APKEYN", i++);
					
				result.add(map);
			}

<<<<<<< HEAD
			return result.toArray(new LinkedHashMap[result.size()]);
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
		@SuppressWarnings({"unchecked" })
		@Override
		public LinkedHashMap<String, Object>[] assignments(final FileDescriptionDisplayer.RichQFile fileToDescribe) {
			if (fileToDescribe.qFile instanceof QDatabaseFile) {
				LinkedHashMap<String, Object>[] result = new LinkedHashMap[1];
				result[0] = new LinkedHashMap<String, Object>();
				addDefaultData("ML", result[0], fileToDescribe.qFile);
				result[0].put("MLNOMB", 1); //Nr. membri
				result[0].put("MLNAME", fileToDescribe.qFile.getName());
				result[0].put("MLNRCD", fileToDescribe.countRecords());
				Date creationDate = fileToDescribe.qFile.getCreationInfo().getCreationDate();
				result[0].put("MLCCEN", 1);
				DateFormat dayFormatter = new SimpleDateFormat("yyMMdd");
				result[0].put("MLCDAT", dayFormatter.format(creationDate));
				result[0].put("MLMTXT", fileToDescribe.qFile.getText());
				return result;
			} else if (fileToDescribe.qFile instanceof QSourceFile) {
				List<QSourceEntry> members = fileToDescribe.getMembers();
				List<LinkedHashMap<String, Object>> result = new ArrayList<LinkedHashMap<String,Object>>();
				for (QSourceEntry member : members) {
					LinkedHashMap<String, Object> memberDescription = new LinkedHashMap<String, Object>();
					addDefaultData("ML", memberDescription, fileToDescribe.qFile);
					memberDescription.put("MLNOMB", members.size()); //Nr. membri
					memberDescription.put("MLNAME", member.getName());
					memberDescription.put("MLMTXT", member.getText());
					result.add(memberDescription);
				}
				return result.toArray(new LinkedHashMap[result.size()]);
			}
			throw fileToDescribe.createException(QCPFMSG.CPF3081, new String[] {fileToDescribe.qFile.getName(), fileToDescribe.qFile.getLibrary(), FileTypeDescripion.forType(fileToDescribe.qFile).descr2, "*MBRLIST"});
		}
	}, 
	SELECT {
		@Override
		public String baseOutputFileName() {
			return "QAFDSELO";
		}
		@Override
		@SuppressWarnings("unchecked")
		public LinkedHashMap<String, Object>[] assignments(final FileDescriptionDisplayer.RichQFile fileToDescribe) {
			if (fileToDescribe.qFile instanceof QDatabaseFile) {
				LinkedHashMap<String, Object>[] result = new LinkedHashMap[1];
				result[0] = new LinkedHashMap<String, Object>();
				addDefaultData("ML", result[0], fileToDescribe.qFile);
				result[0].put("MLNOMB", 1); //Nr. membri
				result[0].put("MLNAME", fileToDescribe.qFile.getName());
				result[0].put("MLNRCD", fileToDescribe.countRecords());
				Date creationDate = fileToDescribe.qFile.getCreationInfo().getCreationDate();
				result[0].put("MLCCEN", 1);
				DateFormat dayFormatter = new SimpleDateFormat("yyMMdd");
				result[0].put("MLCDAT", dayFormatter.format(creationDate));
				result[0].put("MLMTXT", fileToDescribe.qFile.getText());
				return result;
			} else if (fileToDescribe.qFile instanceof QSourceFile) {
				List<QSourceEntry> members = fileToDescribe.getMembers();
				List<LinkedHashMap<String, Object>> result = new ArrayList<LinkedHashMap<String,Object>>();
				for (QSourceEntry member : members) {
					LinkedHashMap<String, Object> memberDescription = new LinkedHashMap<String, Object>();
					addDefaultData("ML", memberDescription, fileToDescribe.qFile);
					memberDescription.put("MLNOMB", members.size()); //Nr. membri
					memberDescription.put("MLNAME", member.getName());
					memberDescription.put("MLMTXT", member.getText());
					result.add(memberDescription);
				}
				return result.toArray(new LinkedHashMap[result.size()]);
			}
			throw fileToDescribe.createException(QCPFMSG.CPF3081, new String[] {fileToDescribe.qFile.getName(), fileToDescribe.qFile.getLibrary(), FileTypeDescripion.forType(fileToDescribe.qFile).descr2, "*MBR"});

		}
	}, 
	SEQ, 
	RCDFMT {
		@Override
		public String baseOutputFileName() {
			return "QAFDRFMT";
		}
		@Override
		@SuppressWarnings("unchecked")
		public LinkedHashMap<String, Object>[] assignments(final FileDescriptionDisplayer.RichQFile fileToDescribe) {
			List<LinkedHashMap<String, Object>> result = new ArrayList<LinkedHashMap<String,Object>>();			
			if (fileToDescribe.qFile instanceof QDatabaseFile) {
				QDatabaseFile databaseFile = (QDatabaseFile) fileToDescribe.qFile;
	
				QDatabaseFileFormat databaseFileFormat = databaseFile.getDatabaseFormat();
				if (databaseFile instanceof QLogicalFile && databaseFileFormat.isEmpty()) {
					QLogicalFile logicalFile = (QLogicalFile) databaseFile;
	
					for (String table : logicalFile.getTables()) {
						QDatabaseFile referredFile = fileToDescribe.findFile(table);
						result.add(describe(databaseFile, referredFile.getDatabaseFormat(), logicalFile.getTables().size()));
					}
				} else {
					result.add(describe(databaseFile, databaseFileFormat, 1));
				}
			} else if (fileToDescribe.qFile instanceof QDisplayFile) {
				QDisplayFile displayFile = (QDisplayFile) fileToDescribe.qFile;
	
				for (QFileFormat<?> fileFormat : displayFile.getDisplayFormats()) {
					result.add(describe(displayFile, fileFormat, displayFile.getDisplayFormats().size()));
				}
			} else if (fileToDescribe.qFile instanceof QPrinterFile) {
				QPrinterFile printerFile = (QPrinterFile) fileToDescribe.qFile;
	
				for (QFileFormat<?> fileFormat : printerFile.getPrinterFormats()) {
					result.add(describe(printerFile, fileFormat, printerFile.getPrinterFormats().size()));
				}
			} else {
				throw new OperatingSystemRuntimeException("Unknown file type: " + fileToDescribe.qFile.getName());
			}
			return result.toArray(new LinkedHashMap[result.size()]);						
		}
		@SuppressWarnings("rawtypes")
		private LinkedHashMap<String, Object> describe(QFile file, QFileFormat fileFormat, int nrOfFormats) {
			LinkedHashMap<String, Object> resultElement = new LinkedHashMap<String, Object>();
			addDefaultData("RF", resultElement, file);
			resultElement.put("RFTOTF", nrOfFormats);
			resultElement.put("RFNAME", fileFormat.getName());
			return resultElement;
		}
	}, 
	MBR{
		@Override
		public String baseOutputFileName() {
			return "QAFDMBR";
		}
		@Override
		@SuppressWarnings("unchecked")
		public LinkedHashMap<String, Object>[] assignments(final FileDescriptionDisplayer.RichQFile fileToDescribe) {
			if (fileToDescribe.qFile instanceof QDatabaseFile) {
				LinkedHashMap<String, Object>[] result = new LinkedHashMap[1];
				result[0] = new LinkedHashMap<String, Object>();
				addDefaultData("MB", result[0], fileToDescribe.qFile);
				result[0].put("MBNOMB", 1); //Nr. membri
				result[0].put("MBNAME", fileToDescribe.qFile.getName());
				result[0].put("MBNRCD", fileToDescribe.countRecords());
				Date creationDate = fileToDescribe.qFile.getCreationInfo().getCreationDate();
				result[0].put("MBCCEN", 1);
				DateFormat dayFormatter = new SimpleDateFormat("yyMMdd");
				result[0].put("MBCDAT", dayFormatter.format(creationDate));
				result[0].put("MBMTXT", fileToDescribe.qFile.getText());
				return result;
			} else if (fileToDescribe.qFile instanceof QSourceFile) {
				List<QSourceEntry> members = fileToDescribe.getMembers();
				List<LinkedHashMap<String, Object>> result = new ArrayList<LinkedHashMap<String,Object>>();
				for (QSourceEntry member : members) {
					LinkedHashMap<String, Object> memberDescription = new LinkedHashMap<String, Object>();
					addDefaultData("MB", memberDescription, fileToDescribe.qFile);
					memberDescription.put("MBNOMB", members.size()); //Nr. membri
					memberDescription.put("MBNAME", member.getName());
					memberDescription.put("MBMTXT", member.getText());
					result.add(memberDescription);
				}
				return result.toArray(new LinkedHashMap[result.size()]);
			}
			throw fileToDescribe.createException(QCPFMSG.CPF3081, new String[] {fileToDescribe.qFile.getName(), fileToDescribe.qFile.getLibrary(), FileTypeDescripion.forType(fileToDescribe.qFile).descr1, "*MBRLIST"});
=======
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
		@SuppressWarnings({"unchecked" })
		@Override
		public LinkedHashMap<String, Object>[] assignments(final FileDescriptionDisplayer.RichQFile fileToDescribe) {
			if (fileToDescribe.qFile instanceof QDatabaseFile) {
				LinkedHashMap<String, Object>[] result = new LinkedHashMap[1];
				result[0] = new LinkedHashMap<String, Object>();
				addDefaultData("ML", result[0], fileToDescribe.qFile);
				result[0].put("MLNOMB", 1); //Nr. membri
				result[0].put("MLNAME", fileToDescribe.qFile.getName());
				result[0].put("MLNRCD", fileToDescribe.countRecords());
				Date creationDate = fileToDescribe.qFile.getCreationInfo().getCreationDate();
				result[0].put("MLCCEN", 1);
				DateFormat dayFormatter = new SimpleDateFormat("yyMMdd");
				result[0].put("MLCDAT", dayFormatter.format(creationDate));
				result[0].put("MLMTXT", fileToDescribe.qFile.getText());
				return result;
			} else if (fileToDescribe.qFile instanceof QSourceFile) {
				List<QSourceEntry> members = fileToDescribe.getMembers();
				List<LinkedHashMap<String, Object>> result = new ArrayList<LinkedHashMap<String,Object>>();
				for (QSourceEntry member : members) {
					LinkedHashMap<String, Object> memberDescription = new LinkedHashMap<String, Object>();
					addDefaultData("ML", memberDescription, fileToDescribe.qFile);
					memberDescription.put("MLNOMB", members.size()); //Nr. membri
					memberDescription.put("MLNAME", member.getName());
					memberDescription.put("MLMTXT", member.getText());
					result.add(memberDescription);
				}
				return result.toArray(new LinkedHashMap[0]);
			}
			throw new RuntimeException("Wrong file type " + fileToDescribe.qFile);
		}
	}, 
	SELECT {
		@Override
		public String baseOutputFileName() {
			return "QAFDSELO";
		}
		@Override
		@SuppressWarnings("unchecked")
		public LinkedHashMap<String, Object>[] assignments(final FileDescriptionDisplayer.RichQFile fileToDescribe) {
			if (!(fileToDescribe.qFile instanceof QLogicalFile)) {
				fileToDescribe.throwException(QCPFMSG.CPF3020, new String[] {fileToDescribe.qFile.getName(), fileToDescribe.qFile.getLibrary(), FileTypeDescripion.forType(fileToDescribe.qFile).descr1, "*SELECT"});		
			}
			//TODO: implementazione incompleta
			LinkedHashMap<String, Object>[] result = new LinkedHashMap[1];
			result[0] = new LinkedHashMap<String, Object>();
			addDefaultData("SO", result[0], fileToDescribe.qFile);
			return result;
		}
	}, 
	SEQ, 
	RCDFMT {
		@Override
		public String baseOutputFileName() {
			return "QAFDRFMT";
		}
		@Override
		@SuppressWarnings("unchecked")
		public LinkedHashMap<String, Object>[] assignments(final FileDescriptionDisplayer.RichQFile fileToDescribe) {
			List<LinkedHashMap<String, Object>> result = new ArrayList<LinkedHashMap<String,Object>>();			
			if (fileToDescribe.qFile instanceof QDatabaseFile) {
				QDatabaseFile databaseFile = (QDatabaseFile) fileToDescribe.qFile;
	
				QDatabaseFileFormat databaseFileFormat = databaseFile.getDatabaseFormat();
				if (databaseFile instanceof QLogicalFile && databaseFileFormat.isEmpty()) {
					QLogicalFile logicalFile = (QLogicalFile) databaseFile;
	
					for (String table : logicalFile.getTables()) {
						QDatabaseFile referredFile = fileToDescribe.findFile(table);
						result.add(describe(databaseFile, referredFile.getDatabaseFormat(), logicalFile.getTables().size()));
					}
				} else {
					result.add(describe(databaseFile, databaseFileFormat, 1));
				}
			} else if (fileToDescribe.qFile instanceof QDisplayFile) {
				QDisplayFile displayFile = (QDisplayFile) fileToDescribe.qFile;
	
				for (QFileFormat<?> fileFormat : displayFile.getDisplayFormats()) {
					result.add(describe(displayFile, fileFormat, displayFile.getDisplayFormats().size()));
				}
			} else if (fileToDescribe.qFile instanceof QPrinterFile) {
				QPrinterFile printerFile = (QPrinterFile) fileToDescribe.qFile;
	
				for (QFileFormat<?> fileFormat : printerFile.getPrinterFormats()) {
					result.add(describe(printerFile, fileFormat, printerFile.getPrinterFormats().size()));
				}
			} else {
				throw new OperatingSystemRuntimeException("Unknown file type: " + fileToDescribe.qFile.getName());
			}
			return result.toArray(new LinkedHashMap[0]);						
		}
		@SuppressWarnings("rawtypes")
		private LinkedHashMap<String, Object> describe(QFile file, QFileFormat fileFormat, int nrOfFormats) {
			LinkedHashMap<String, Object> resultElement = new LinkedHashMap<String, Object>();
			addDefaultData("RF", resultElement, file);
			resultElement.put("RFTOTF", nrOfFormats);
			resultElement.put("RFNAME", fileFormat.getName());
			return resultElement;
		}
	}, 
	MBR{
		@Override
		public String baseOutputFileName() {
			return "QAFDMBR";
>>>>>>> branch 'master' of https://github.com/smeup/asup.git
		}
	}, 
	ATR, SPOOL, JOIN, TRG, CST, NODGRP;
	public String baseOutputFileName() {
		throw new RuntimeException("Unsupported information type " + this.name());			
	}

	public LinkedHashMap<String, Object>[] assignments(FileDescriptionDisplayer.RichQFile fileToDescribe) {
		throw new RuntimeException("Unsupported information type " + this.name());	
	}
	
	private static void addDefaultData(String prefix, LinkedHashMap<String, Object> map, QFile fileToDescribe) {
		map.put(prefix + "RCEN", "1"); //Secolo chiamata
		Date now = new Date();
		DateFormat dayFormatter = new SimpleDateFormat("yyMMdd");
		map.put(prefix + "RDAT", dayFormatter.format(now));
		SimpleDateFormat hourFormatter = new SimpleDateFormat("hhmmss");
		map.put(prefix + "RTIM", hourFormatter.format(now));
		map.put(prefix + "FILE", fileToDescribe.getName());
		map.put(prefix + "LIB", fileToDescribe.getLibrary());
		FileTypeDescripion typeDescripion = FileTypeDescripion.forType(fileToDescribe);
		map.put(prefix + "FTYP", typeDescripion.descr1);
		map.put(prefix + "FILA", typeDescripion.descr2);
		map.put(prefix + "FATR", typeDescripion.descr3);
	}

	public static class FileTypeDescripion {
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
			if ((fileToDescribe instanceof QPhysicalFile) || 
				(fileToDescribe instanceof QSourceFile)) {
				return new FileTypeDescripion("P", "*PHY", "PF");
			}
			if ((fileToDescribe instanceof QPrinterFile)) {  
				return new FileTypeDescripion("D", "*PRT", "PRTF");
			}
			if ((fileToDescribe instanceof QDisplayFile)) {  
				return new FileTypeDescripion("D", "*DSP", "DSPF");
			}
			throw new RuntimeException("Unsupported file type: " + fileToDescribe);
		}
	}

}
