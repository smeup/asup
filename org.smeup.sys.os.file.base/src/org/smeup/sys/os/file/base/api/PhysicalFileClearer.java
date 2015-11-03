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
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.QExceptionManager;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.file.QFile;
import org.smeup.sys.os.file.QPhysicalFile;
import org.smeup.sys.os.file.base.api.FileFinder.FILE;

@Program(name = "QDBCLRPF")
public class PhysicalFileClearer {
	public static enum QCPFMSG {
		CPF3142, CPF3136 
	}
	
	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QJob job;
	@Inject
	private QExceptionManager exceptionManager;

	
	@Main
	public void main(@DataDef(qualified = true) FILE file, @DataDef(length = 10) QEnum<Member, QCharacter> member) {

		FileFinder fileFinder = new FileFinder(job, resourceManager);
		QFile qFile = fileFinder.lookup(file);

		if (qFile == null)
			throw exceptionManager.prepareException(job, QCPFMSG.CPF3142, new String[] {file.nameGeneric.trimR(), member.asData().trimR(),  file.library.asData().trimR()});		
		
		QConnection connection = job.getContext().getAdapter(job, QConnection.class);

		try {
			if (qFile instanceof QPhysicalFile) {
				Table table = connection.getCatalogMetaData().getTable(qFile.getLibrary(), qFile.getName());
				deleteData(connection, table);
			} else {
				throw exceptionManager.prepareException(job, QCPFMSG.CPF3136, new String[] {file.nameGeneric.trimR(), member.asData().trimR(), file.library.asData().trimR()});		
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
			throw exceptionManager.prepareException(job, QCPFMSG.CPF3136, new String[] {table.getName(), table.getSchema().getName()});		

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
