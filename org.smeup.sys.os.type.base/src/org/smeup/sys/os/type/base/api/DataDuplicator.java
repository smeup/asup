package org.smeup.sys.os.type.base.api;

import java.sql.SQLException;

import org.eclipse.datatools.modelbase.sql.tables.Table;
import org.smeup.sys.db.core.QConnection;
import org.smeup.sys.db.core.QPreparedStatement;
import org.smeup.sys.db.syntax.QDefinitionWriter;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.type.QTypedObject;

public class DataDuplicator {

	private QJob job;

	public DataDuplicator(QJob job) {
		this.job = job;
	}

	public void duplicateData(QTypedObject objToDuplicate, QTypedObject duplicatedObject) {
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
}
