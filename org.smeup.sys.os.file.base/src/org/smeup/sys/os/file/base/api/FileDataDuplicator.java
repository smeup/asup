package org.smeup.sys.os.file.base.api;

import java.sql.SQLException;

import org.eclipse.datatools.modelbase.sql.tables.Table;
import org.smeup.sys.db.core.QConnection;
import org.smeup.sys.db.core.QDatabaseManager;
import org.smeup.sys.db.core.QPreparedStatement;
import org.smeup.sys.db.syntax.QDefinitionWriter;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.file.QFile;

public class FileDataDuplicator {

	private QConnection connection;
	private QDefinitionWriter definitionWriter;
	private Table tableFrom;
	private Table tableTo;
	private boolean isRelativeRecordNumber;

	public FileDataDuplicator(QConnection connection, QFile fileFrom) {
		this.connection = connection;
		this.definitionWriter = connection.getContext().get(QDefinitionWriter.class);
		this.tableFrom = tableFor(fileFrom);
		this.isRelativeRecordNumber = connection.getCatalogGenerationStrategy().isCreateRelativeRecordNumber();
	}

	private Table tableFor(QFile fileFrom) {
		return connection.getCatalogMetaData().getTable(fileFrom.getLibrary(), fileFrom.getName());
	}

	public void duplicateData(int fromRecordNr, int toRecordNr) {
		String command = definitionWriter.copyTableData(tableFrom, tableTo, isRelativeRecordNumber);
		execute(command + whereRRN(fromRecordNr, toRecordNr));
	}

	private String where(int fromRecordNr, int toRecordNr) {
		if (fromRecordNr > 0) {
			if (toRecordNr > 0) {
				return QDatabaseManager.TABLE_COLUMN_RELATIVE_RECORD_NUMBER_NAME + " BETWEEN " + fromRecordNr  + " AND " +  + toRecordNr;								
			} else {
				return QDatabaseManager.TABLE_COLUMN_RELATIVE_RECORD_NUMBER_NAME + " >= " + fromRecordNr;				
			}
		} else {
			return QDatabaseManager.TABLE_COLUMN_RELATIVE_RECORD_NUMBER_NAME + " <= " + toRecordNr;
		}
	}

	public void clearFileTo() {
		String command = definitionWriter.deleteData(this.tableTo);
		execute(command);
	}
	
	private void execute(String sql) {
		try (QPreparedStatement stmt = connection.prepareStatement(sql);) {
			stmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new OperatingSystemRuntimeException(e);
		}
	}

	public void setFileTo(QFile qFileTo) {
		this.tableTo = tableFor(qFileTo);
	}

	public String fileFromResultsetQry(int fromRecordNr, int toRecordNr) {
		String command = definitionWriter.selectData(tableFrom);
		return command + whereRRN(fromRecordNr, toRecordNr);
	}

	private String whereRRN(int fromRecordNr, int toRecordNr) {
		if (isRelativeRecordNumber && (fromRecordNr > 0 || toRecordNr > 0)) {
			return  " WHERE " + where(fromRecordNr, toRecordNr);
		}
		return "";
	}
	
}
