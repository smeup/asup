/**
 *  Copyright (c) 2012, 2015 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Giuliano Giancristofaro - Initial API and implementation
 */
package org.smeup.sys.os.file.base.api;

import java.sql.SQLException;

import javax.inject.Inject;

import org.eclipse.datatools.modelbase.sql.tables.Table;
import org.eclipse.datatools.modelbase.sql.tables.ViewTable;
import org.smeup.sys.db.core.QConnection;
import org.smeup.sys.db.core.QStatement;
import org.smeup.sys.db.syntax.QDefinitionWriter;
import org.smeup.sys.il.data.QCharacter;
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

@Program(name = "QDBCLRPF")
public class PhysicalFileClearer {

	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QJob job;

	@Entry
	public void main(FileRef file, @DataDef(length = 10) QEnum<Member, QCharacter> member) {

		// TODO Intercept library special value
		QResourceReader<QFile> fileReader = resourceManager.getResourceReader(job, QFile.class, Scope.LIBRARY_LIST);
		QFile qFile = fileReader.lookup(file.name.trimR());

		if (qFile == null)
			throw new OperatingSystemRuntimeException("File not found: " + file);
		
		QConnection connection = job.getContext().getAdapter(job, QConnection.class);

		// create
		try {
			if (qFile instanceof QPhysicalFile) {
				Table table = connection.getCatalogMetaData().getTable(qFile.getLibrary(), qFile.getName());
				deleteData(connection, table);
			}
		} catch (SQLException e) {
			throw new OperatingSystemRuntimeException(e);
		}
	}

	public static enum Member {
		@Special(value = "*FIRST")
		FIRST, @Special(value = "*LAST")
		LAST, @Special(value = "*ALL")
		ALL, OTHER
	}

	public void deleteData(QConnection connection, Table table) throws SQLException {

		// persistent table only
		if (table instanceof ViewTable)
			return;

		QStatement statement = null;
		try {
			QDefinitionWriter definitionWriter = connection.getContext().get(QDefinitionWriter.class);
			String command = definitionWriter.deleteData(table);

			statement = connection.createStatement(true);
			statement.execute(command);
		} finally {
			if (statement != null)
				statement.close();
		}
	}

}
