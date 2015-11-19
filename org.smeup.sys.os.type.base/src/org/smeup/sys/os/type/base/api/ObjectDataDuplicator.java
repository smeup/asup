/**
 *  Copyright (c) 2012, 2015 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Franco Lombardo - Initial API and implementation
 */
package org.smeup.sys.os.type.base.api;

import java.sql.SQLException;

import org.eclipse.datatools.modelbase.sql.tables.Table;
import org.smeup.sys.db.core.QConnection;
import org.smeup.sys.db.core.QPreparedStatement;
import org.smeup.sys.db.syntax.QDefinitionWriter;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.type.QTypedObject;

public class ObjectDataDuplicator {

	private QConnection connection;

	public ObjectDataDuplicator(QConnection connection) {
		this.connection = connection;
	}

	public void duplicateData(QTypedObject objToDuplicate, QTypedObject duplicatedObject) {
		Table tableFrom = connection.getCatalogMetaData().getTable(objToDuplicate.getLibrary(), objToDuplicate.getName());
		Table tableTo = connection.getCatalogMetaData().getTable(duplicatedObject.getLibrary(), duplicatedObject.getName());
		duplicateData(tableFrom, tableTo);
	}

	public void duplicateData(Table tableFrom, Table tableTo) {
		QDefinitionWriter definitionWriter = connection.getContext().get(QDefinitionWriter.class);
		String command = definitionWriter.copyTableData(tableFrom, tableTo, connection.getCatalogGenerationStrategy().isCreateRelativeRecordNumber());
		try (QPreparedStatement stmt = connection.prepareStatement(command);) {
			stmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new OperatingSystemRuntimeException(e);
		}
	}
}
