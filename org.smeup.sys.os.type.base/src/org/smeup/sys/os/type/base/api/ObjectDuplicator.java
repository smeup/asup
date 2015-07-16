package org.smeup.sys.os.type.base.api;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.eclipse.datatools.modelbase.sql.tables.Table;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.smeup.sys.db.core.QConnection;
import org.smeup.sys.db.core.QPreparedStatement;
import org.smeup.sys.db.syntax.QDefinitionWriter;
import org.smeup.sys.dk.core.annotation.Supported;
import org.smeup.sys.il.core.QObjectIterator;
import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.QScroller;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Entry;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.Scope;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobLogManager;
import org.smeup.sys.os.core.resources.QResourceManager;
import org.smeup.sys.os.core.resources.QResourceReader;
import org.smeup.sys.os.core.resources.QResourceWriter;
import org.smeup.sys.os.file.QPhysicalFile;
import org.smeup.sys.os.type.QType;
import org.smeup.sys.os.type.QTypeRegistry;
import org.smeup.sys.os.type.QTypedObject;

@Program(name = "QLICRDUP")
public @Supported class ObjectDuplicator {
	public static enum QCPFMSG {
		CPF2130
	}

	@Inject
	private QTypeRegistry typeRegistry;
	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QJob job;
	@Inject
	private QJobLogManager jobLogManager;
	
	public @Entry void main(
			@Supported @DataDef(length = 10) QEnum<FROMOBJECTEnum, QCharacter> fromObject,
			@Supported @DataDef(length = 10) QEnum<FROMLIBRARYEnum, QCharacter> fromLibrary,
			@Supported @DataDef(dimension=57,length=7) QEnum<OBJECTTYPEEnum, QScroller<QCharacter>> objectTypes,
			@Supported @DataDef(length = 10) QEnum<TOLIBRARYEnum, QCharacter> toLibrary,
			@Supported @DataDef(length = 10) QEnum<NEWOBJECTEnum, QCharacter> newObjectName,
			@DataDef(length = 10) QEnum<FROMASPDEVICEEnum, QCharacter> fromASPDevice,
			@DataDef(length = 10) QEnum<TOASPDEVICEEnum, QCharacter> toASPDevice,
			@Supported @DataDef(length = 1) QEnum<DUPLICATEDATAEnum, QCharacter> duplicateData,
			@DataDef(length = 1) QEnum<DUPLICATECONSTRAINTSEnum, QCharacter> duplicateConstraints,
			@DataDef(length = 1) QEnum<DUPLICATETRIGGERSEnum, QCharacter> duplicateTriggers,
			@DataDef(length = 1) QEnum<DUPLICATEFILEIDENTIFIERSEnum, QCharacter> duplicateFileIdentifiers) {
		
		List<QType<?>> types = typesFrom(objectTypes);
		for (QType<?> type : types) {
			QResourceReader<?> resourceReader = null;
			switch (fromLibrary.asEnum()) {
			case CURLIB:
				resourceReader = resourceManager.getResourceReader(job, type.getTypedClass(), Scope.CURRENT_LIBRARY);
				break;
			case LIBL:
				resourceReader = resourceManager.getResourceReader(job, type.getTypedClass(), Scope.LIBRARY_LIST);
				break;
			case OTHER:
				resourceReader = resourceManager.getResourceReader(job, type.getTypedClass(), fromLibrary.asData().trimR());
				break;
			}

			QObjectIterator<? extends QObjectNameable> objectIterator = null;

			switch (fromObject.asEnum()) {
			case ALL:
				objectIterator = resourceReader.find(null);
				break;

			case OTHER:
				objectIterator = resourceReader.find(fromObject.asData().trimR());
				break;

			}
			
			while (objectIterator.hasNext()) {
				duplicate(toLibrary, newObjectName, type, (QTypedObject) objectIterator.next(), duplicateData.asEnum());
			}
		}
		
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void duplicate(QEnum<TOLIBRARYEnum, QCharacter> toLibrary,	
			               QEnum<NEWOBJECTEnum, QCharacter> newObjectName, 
			               QType<?> type, 
			               QTypedObject objToDuplicate, 
			               DUPLICATEDATAEnum duplicateData) {
		QResourceWriter resourceWriter = getWriter(toLibrary, type, objToDuplicate.getLibrary());
		
		QTypedObject duplicatedObject = (QTypedObject) EcoreUtil.copy((EObject)objToDuplicate);

		switch (newObjectName.asEnum()) {
		case SAME:
		case OBJ:
			//Nulla
			break;

		case OTHER:
			duplicatedObject.setName(newObjectName.asData().trimR());
			break;
		}
		
		resourceWriter.save(duplicatedObject);
		if ((objToDuplicate instanceof QPhysicalFile) && DUPLICATEDATAEnum.YES.equals(duplicateData)) {
			duplicateData(objToDuplicate, duplicatedObject);
		}
		jobLogManager.info(job, "Object " + duplicatedObject.getName() + " created in library " + duplicatedObject.getLibrary() + " of type " + type.getName());
	}

	private void duplicateData(QTypedObject objToDuplicate, QTypedObject duplicatedObject) {
		QPreparedStatement stmt = null;
		try {
			QConnection connection = job.getContext().getAdapter(job, QConnection.class);
			
			QDefinitionWriter definitionWriter = connection.getContext().get(QDefinitionWriter.class);

			Table tableFrom = connection.getCatalogMetaData().getTable(objToDuplicate.getLibrary(), objToDuplicate.getName());
			Table tableTo = connection.getCatalogMetaData().getTable(duplicatedObject.getLibrary(), duplicatedObject.getName());
			
			String command = definitionWriter.copyTableData(tableFrom, tableTo, connection.getCatalogGenerationStrategy().isCreateRelativeRecordNumber());
			stmt = connection.prepareStatement(command);
			stmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new OperatingSystemRuntimeException(e);
		} finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
				}
			}
		}
	}

	private QResourceWriter<? extends QTypedObject> getWriter(QEnum<TOLIBRARYEnum, QCharacter> toLibrary, QType<?> type, String sourceLibraryName) {
		QResourceWriter<? extends QTypedObject> resourceWriter = null;
		
		switch (toLibrary.asEnum()) {
		case CURLIB:
			resourceWriter = resourceManager.getResourceWriter(job, type.getTypedClass(), Scope.CURRENT_LIBRARY);
			break;
		
		case SAME:
		case FROMLIB:
			resourceWriter = resourceManager.getResourceWriter(job, type.getTypedClass(), sourceLibraryName);
			break;
		
		case OTHER:
			resourceWriter = resourceManager.getResourceWriter(job, type.getTypedClass(), toLibrary.asData().trimR());
			break;
		}	
		
		return resourceWriter;
	}

	private List<QType<?>> typesFrom(QEnum<OBJECTTYPEEnum, QScroller<QCharacter>> objectTypes) {
		List<QType<?>> result = new ArrayList<QType<?>>();
		
		for(QCharacter type: objectTypes.asData()) {
			String objectTypeString = type.trimR();
			if (objectTypeString != null && !"".equals(objectTypeString.trim())) {
				if (objectTypeString.equals("*ALL")) {
					result.addAll(typeRegistry.list());
				    break;
				} else {
					QType<?> typeFound = typeRegistry.lookup("*" + objectTypeString);
					if (typeFound != null) {
						result.add(typeFound);
					}
				}
			}
		}

		return result;
	}

	public static enum FROMOBJECTEnum {
		ALL, OTHER
	}

	public static enum FROMLIBRARYEnum {
		LIBL, CURLIB, OTHER
	}

	public static enum OBJECTTYPEEnum {
		ALL, 
		@Special(value = "ALRTBL") ALRTBL, 
		@Special(value = "AUTL") AUTL, @Special(value = "BNDDIR")
		BNDDIR, @Special(value = "CHTFMT")
		CHTFMT, @Special(value = "CLD")
		CLD, @Special(value = "CLS")
		CLS, @Special(value = "CMD")
		CMD, @Special(value = "CRQD")
		CRQD, @Special(value = "CSI")
		CSI, @Special(value = "CSPMAP")
		CSPMAP, @Special(value = "CSPTBL")
		CSPTBL, @Special(value = "DTAARA")
		DTAARA, @Special(value = "FCT")
		FCT, @Special(value = "FILE")
		FILE, @Special(value = "FNTRSC")
		FNTRSC, @Special(value = "FNTTBL")
		FNTTBL, @Special(value = "FORMDF")
		FORMDF, @Special(value = "FTR")
		FTR, @Special(value = "GSS")
		GSS, @Special(value = "IGCDCT")
		IGCDCT, @Special(value = "IGCSRT")
		IGCSRT, @Special(value = "JOBD")
		JOBD, @Special(value = "JOBQ")
		JOBQ, @Special(value = "LOCALE")
		LOCALE, @Special(value = "MEDDFN")
		MEDDFN, @Special(value = "MENU")
		MENU, @Special(value = "MGTCOL")
		MGTCOL, @Special(value = "MODULE")
		MODULE, @Special(value = "MSGF")
		MSGF, @Special(value = "MSGQ")
		MSGQ, @Special(value = "M36CFG")
		M36CFG, @Special(value = "NODGRP")
		NODGRP, @Special(value = "NODL")
		NODL, @Special(value = "OUTQ")
		OUTQ, @Special(value = "OVL")
		OVL, @Special(value = "PAGDFN")
		PAGDFN, @Special(value = "PAGSEG")
		PAGSEG, @Special(value = "PDFMAP")
		PDFMAP, @Special(value = "PDG")
		PDG, @Special(value = "PGM")
		PGM, @Special(value = "PNLGRP")
		PNLGRP, @Special(value = "PRDAVL")
		PRDAVL, @Special(value = "PRDDFN")
		PRDDFN, @Special(value = "PRDLOD")
		PRDLOD, @Special(value = "PSFCFG")
		PSFCFG, @Special(value = "QMFORM")
		QMFORM, @Special(value = "QMQRY")
		QMQRY, @Special(value = "QRYDFN")
		QRYDFN, @Special(value = "SBSD")
		SBSD, @Special(value = "SCHIDX")
		SCHIDX, @Special(value = "SRVPGM")
		SRVPGM, @Special(value = "SSND")
		SSND, @Special(value = "TBL")
		TBL, @Special(value = "USRIDX")
		USRIDX, @Special(value = "USRSPC")
		USRSPC, @Special(value = "VLDL")
		VLDL, @Special(value = "WSCST")
		WSCST
	}

	public static enum TOLIBRARYEnum {
		@Special(value = "*SAME")
		FROMLIB, SAME, CURLIB, OTHER
	}

	public static enum NEWOBJECTEnum {
		@Special(value = "*SAME")
		OBJ, SAME, OTHER
	}

	public static enum FROMASPDEVICEEnum {
		@Special(value = "*")
		TERM_STAR, CURASPGRP, SYSBAS, OTHER
	}

	public static enum TOASPDEVICEEnum {
		ASPDEV, @Special(value = "*")
		TERM_STAR, CURASPGRP, SYSBAS, OTHER
	}

	public static enum DUPLICATEDATAEnum {
		@Special(value = "N")
		NO, @Special(value = "Y")
		YES
	}

	public static enum DUPLICATECONSTRAINTSEnum {
		@Special(value = "Y")
		YES, @Special(value = "N")
		NO
	}

	public static enum DUPLICATETRIGGERSEnum {
		@Special(value = "Y")
		YES, @Special(value = "N")
		NO
	}

	public static enum DUPLICATEFILEIDENTIFIERSEnum {
		@Special(value = "N")
		NO, @Special(value = "Y")
		YES
	}
}
