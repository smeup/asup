package org.smeup.sys.os.type.base.api;

import java.sql.SQLException;

import org.eclipse.datatools.modelbase.sql.tables.Table;
import org.smeup.sys.db.core.QConnection;
import org.smeup.sys.db.core.QPreparedStatement;
import org.smeup.sys.db.syntax.QDefinitionWriter;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.type.QTypedObject;

public class DataDuplicator {

	private QConnection connection;

	public DataDuplicator(QConnection connection) {
		this.connection = connection;
	}


	public void duplicateData(QTypedObject objToDuplicate, QTypedObject duplicatedObject) {
		Table tableFrom = connection.getCatalogMetaData().getTable(objToDuplicate.getLibrary(), objToDuplicate.getName());
		Table tableTo = connection.getCatalogMetaData().getTable(duplicatedObject.getLibrary(), duplicatedObject.getName());
		duplicateData(tableFrom, tableTo);
	}
	
	public void duplicateData(Table tableFrom, Table tableTo) {
		QPreparedStatement stmt = null;
		try {
			QDefinitionWriter definitionWriter = connection.getContext().get(QDefinitionWriter.class);
			
			String command = definitionWriter.copyTableData(tableFrom, tableTo, connection.getCatalogGenerationStrategy().isCreateRelativeRecordNumber());
			stmt = connection.prepareStatement(command);
			stmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new OperatingSystemRuntimeException(e);
		} finally {
			connection.close(stmt);
		}
	}
}
