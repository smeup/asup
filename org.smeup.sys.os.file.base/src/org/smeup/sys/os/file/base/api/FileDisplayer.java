/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Franco Lombardo - Initial API and implementation
 */
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
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.QExceptionManager;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.file.QFile;
import org.smeup.sys.os.file.QPhysicalFile;
import org.smeup.sys.os.file.base.api.tools.Displayer;

@Program(name = "QNFBROWS")
public class FileDisplayer {
	public static enum QCPFMSG {
		CPF9812, CPF8056
	}

	@Inject
	private QOutputManager outputManager;
	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QJob job;
	@Inject
	private QExceptionManager exceptionManager;

	@Main
	public void main(@DataDef(qualified = true) FileRef file, @DataDef(length = 1) QEnum<OUTPUTEnum, QCharacter> output) {

		QResourceReader<QFile> fileReader = resourceManager.getResourceReader(job, QFile.class, file.library.asEnum(), file.library.asData().trimR());
		QFile qFile = fileReader.lookup(file.name.trimR());

		if (qFile == null)
			throw exceptionManager.prepareException(job, QCPFMSG.CPF9812, file);

		if (!(qFile instanceof QPhysicalFile))
			throw exceptionManager.prepareException(job, QCPFMSG.CPF8056, file);

		display((QPhysicalFile) qFile, output);
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
			ResultSet resultSet = null;
			try {
				statement = connection.createStatement(true);
				resultSet = statement.executeQuery(sql);
				new Displayer(objectWriter).display(resultSet);
			} finally {
				if (connection != null) {
					connection.close(resultSet);
					connection.close(statement);
				}
			}
		} catch (Exception e) {
			throw new OperatingSystemRuntimeException(e);
		}
	}

	public static enum OUTPUTEnum {
		@Special(value = "*")
		TERM_STAR, @Special(value = "P")
		PRINT
	}
}
