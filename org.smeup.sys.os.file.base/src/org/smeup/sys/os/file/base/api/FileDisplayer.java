package org.smeup.sys.os.file.base.api;

import java.sql.ResultSet;

import javax.inject.Inject;

import org.eclipse.datatools.modelbase.sql.tables.Table;
import org.smeup.sys.db.core.QConnection;
import org.smeup.sys.db.core.QStatement;
import org.smeup.sys.db.syntax.QDefinitionWriter;
import org.smeup.sys.il.core.out.QObjectWriter;
import org.smeup.sys.il.core.out.QOutputManager;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Entry;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.Scope;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.resources.QResourceManager;
import org.smeup.sys.os.core.resources.QResourceReader;
import org.smeup.sys.os.file.QFile;
import org.smeup.sys.os.file.QPhysicalFile;
import org.smeup.sys.os.file.base.api.tools.Dysplayer;

@Program(name = "QNFBROWS")
public class FileDisplayer {
	public static enum QCPFMSG {
	}

	@Inject
	private QOutputManager outputManager;
	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QJob job;

	
	public @Entry void main(@DataDef(qualified = true) FILE file,
			                @DataDef(length = 1) QEnum<OUTPUTEnum, QCharacter> output) {
		
		QResourceReader<QFile> fileReader = null;

		switch (file.library.asEnum()) {
		case CURLIB:
			fileReader = resourceManager.getResourceWriter(job, QFile.class, Scope.CURRENT_LIBRARY);
			break;
		case LIBL:
			fileReader = resourceManager.getResourceWriter(job, QFile.class, Scope.LIBRARY_LIST);
			break;
		case ALL:
			fileReader = resourceManager.getResourceWriter(job, QFile.class, Scope.ALL);
			break;
		case ALLUSR:
			fileReader = resourceManager.getResourceWriter(job, QFile.class, Scope.ALL_USER);
			break;
		case USRLIBL:
			fileReader = resourceManager.getResourceWriter(job, QFile.class, Scope.USER_LIBRARY_LIST);
			break;
		case OTHER:
			fileReader = resourceManager.getResourceWriter(job, QFile.class, file.library.asData().trimR());
			break;
		}

		QFile qFile = fileReader.lookup(file.nameGeneric.trimR());
		if(qFile == null)
			throw new OperatingSystemRuntimeException("File " + file.nameGeneric.trimR() + " not found in library " + file.library);

		if (!(qFile instanceof QPhysicalFile)) {
			throw new OperatingSystemRuntimeException("File " + file.nameGeneric.trimR() + " in library " + file.library + " is not a physical file");
		}

		
		display((QPhysicalFile)qFile, output);
	}

	private void display(QPhysicalFile qFile, QEnum<OUTPUTEnum, QCharacter> output) {
		QConnection connection = null;
		try {
			connection = job.getContext().getAdapter(job, QConnection.class);

			Table table = connection.getCatalogMetaData().getTable(qFile.getLibrary(), qFile.getName());
		
			QObjectWriter objectWriter = null;
			
			switch (output.asEnum()) {
			case PRINT:
				objectWriter = outputManager.getObjectWriter(job.getContext(), "P");
				break;
			case TERM_STAR:
				objectWriter = outputManager.getDefaultWriter(job.getContext());
				break;
			}
			
			
			QDefinitionWriter definitionWriter = connection.getContext().get(QDefinitionWriter.class);
			String sql = definitionWriter.selectData(table);
			
			QStatement statement = null;
			try {
				statement = connection.createStatement(true);

				ResultSet resultSet = statement.executeQuery(sql);

				new Dysplayer(objectWriter).display(resultSet);

			} catch (Exception e) {
				throw new OperatingSystemRuntimeException(e);
			} finally {
				if (connection != null)
					connection.close(statement);
			}
		} catch (Exception e) {
			throw new OperatingSystemRuntimeException(e);
		}
	}

	public static class FILE extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter nameGeneric;
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<LIBRARYEnum, QCharacter> library;

		public static enum LIBRARYEnum {
			LIBL, CURLIB, USRLIBL, ALL, ALLUSR, OTHER
		}
	}
	
	public static enum OUTPUTEnum {
		@Special(value = "*")
		TERM_STAR, @Special(value = "P")
		PRINT
	}
}
